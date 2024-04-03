package com.myshopping.MyShopping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;


@Entity   // annotation will tell hibernate to create table of this class
public class AppUsers {

    @Id
    UUID id;

    @Column(nullable = false)
    String name;
    @Column(nullable = false, unique = true)
    String email;
    @Column(nullable = false)
    String password;
    String userType;
    @Column(unique = true, length=10)
    Long phoneNo;

    public AppUsers(UUID id, String name, String email, String password, String userType, Long phoneNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.phoneNo = phoneNo;
    }



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
