package com.rest_api.rest_api;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name ="_User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Getters and setters (omitted for brevity)
}