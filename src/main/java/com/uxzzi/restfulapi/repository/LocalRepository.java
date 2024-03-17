package com.uxzzi.restfulapi.repository;

import com.uxzzi.restfulapi.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LocalRepository extends JpaRepository<Local,Long> {

    //Consulta con JPQL
    @Query("SELECT l FROM Local l WHERE l.name = :name")
    Optional<Local> findLocalByNameWithJPQL(String name);

    //Consultas con Inversión de Control
    Optional<Local> findByName(String name);

    Optional<Local> findByNameIgnoreCase(String name);

    List<Local> findByNameIgnoreCaseStartingWith(String name);

}
