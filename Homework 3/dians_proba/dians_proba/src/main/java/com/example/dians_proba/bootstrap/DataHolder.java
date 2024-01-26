package com.example.dians_proba.bootstrap;

import com.example.dians_proba.model.Monument;
import com.example.dians_proba.model.User;
import com.example.dians_proba.repository.MonumentRepository;
import com.example.dians_proba.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DataHolder {
    public static List<Monument> monuments = null;
    public static List<User> users = null;

    private final UserRepository userRepository;
    private final MonumentRepository monumentRepository;

    public DataHolder(UserRepository userRepository, MonumentRepository monumentRepository) {
        this.userRepository = userRepository;
        this.monumentRepository = monumentRepository;
    }

    @PostConstruct
    public void init() {
        userRepository.save(new User("User_name", "User_surname", "u", "u"));
        monumentRepository.save(new Monument("Католичка црква",null,null,null,null,null,null,"41.4350382","22.6401158"));
        monumentRepository.save(new Monument("Манастир Света Петка", "Saint Petka Monastery", "Hristijanstvo", null, null, null, null, "4485913838", "41.1291432"));
    }

}