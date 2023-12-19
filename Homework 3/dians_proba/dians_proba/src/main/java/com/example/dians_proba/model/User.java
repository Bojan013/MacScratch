package com.example.dians_proba.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {
    @Id
    private String username;
    private String name;
    private String surname;

    private String password;

    private String feedback;
    private boolean isSatisfied;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Monument> visitedPlaces;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Monument> wishList;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Monument> favouritePlaces;

    public User(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.feedback = "";
        this.isSatisfied = true;
        visitedPlaces = new ArrayList<>();
        wishList = new ArrayList<>();
        favouritePlaces = new ArrayList<>();
    }
}
