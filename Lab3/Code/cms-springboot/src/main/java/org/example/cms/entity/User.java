package org.example.cms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // getter setter
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}