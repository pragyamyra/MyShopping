package com.myshopping.MyShopping.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Student {
    @Id
    UUID id;
    String name;
    @OneToMany
    List<Laptop> laptop;
}
