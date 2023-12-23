package com.example.dians_proba.web;

import com.example.dians_proba.model.Monument;
import com.example.dians_proba.service.MonumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarkerController {

    @Autowired
    private MonumentService monumentService;

    @GetMapping("/GetMarkers")
    public List<Monument> getMarkers() {
        return monumentService.listAllMonumentsSine();
    }
}