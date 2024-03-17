package com.uxzzi.restfulapi.controller;

import com.uxzzi.restfulapi.entity.Local;
import com.uxzzi.restfulapi.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class LocalController {
    @Autowired
    LocalService localService;

    @GetMapping("/local")
    public List<Local> findAllLocals() {
        return localService.findAllLocals();
    }

    @GetMapping("/local/{id}")
    public Local getLocal(@PathVariable Long id) {
        return localService.getLocal(id);
    }

    @GetMapping("/findLocalByName/{name}")
    Optional<Local> findLocalByNameWithJPQL(@PathVariable String name) {
        return localService.findLocalByNameWithJPQL(name);
    }

    @GetMapping("/findByName/{name}")
    Optional<Local> findByName(@PathVariable String name) {
        return localService.findByName(name);
    }

    @GetMapping("/findByNameIgnoreCase/{name}")
    Optional<Local> findByNameIgnoreCase(@PathVariable String name) {
        return localService.findByNameIgnoreCase(name);
    }

    @GetMapping("/findByNameIgnoreCaseStartingWith/{name}")
    List<Local> findByNameIgnoreCaseStartingWith(@PathVariable String name) {
        return localService.findByNameIgnoreCaseStartingWith(name);
    }

    @PostMapping("/local")
    public Local saveLocal(@RequestBody Local local) {
        return localService.saveLocal(local);
    }

    @PutMapping("/local/{id}")
    public Local updateLocal(@PathVariable Long id,@RequestBody Local local) {
        return localService.updateLocal(id, local);
    }

    @DeleteMapping("/local/{id}")
    public String deleteLocal(@PathVariable Long id) {
        String name = String.valueOf(localService.getLocal(id).getName());
        localService.deleteLocal(id);
        return "Local " + name + " deleted";
    }
}
