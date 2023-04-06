package com.jpaLearning.spa.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id // making it as primary value
    @GeneratedValue // telling it as generated value
    private long id;

    private String name;
    private String role;

    protected User(){}
    public User(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

/*
* Jpa expects a Default consturctor
*
* Aim take the data from USER and store/map it to USER, for this we an entity
* */
