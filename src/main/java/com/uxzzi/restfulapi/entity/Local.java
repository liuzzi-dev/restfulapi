package com.uxzzi.restfulapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "locals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String floor;
    private String code;
}
