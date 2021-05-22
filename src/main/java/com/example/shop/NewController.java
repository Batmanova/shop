package com.example.shop;

import com.example.shop.repositories.GoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class NewController {
    @Autowired
    private GoodRepo goodRepo;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
