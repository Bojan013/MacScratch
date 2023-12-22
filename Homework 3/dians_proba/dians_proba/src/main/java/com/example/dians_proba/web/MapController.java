package com.example.dians_proba.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
public class MapController {
    @GetMapping
    public String getMapPage(Model model) {
        model.addAttribute("bodyContent", "map");
        return "master_template";
    }
}