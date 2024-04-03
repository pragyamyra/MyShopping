package com.myshopping.MyShopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;
import java.util.UUID;
@Entity
public class Laptop {
    @Id
    UUID id;
    String name;
    @ManyToMany
    List<Student> student;
}
