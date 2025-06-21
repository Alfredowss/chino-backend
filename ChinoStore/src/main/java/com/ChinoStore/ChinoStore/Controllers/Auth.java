package com.ChinoStore.ChinoStore.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class Auth {

    @GetMapping
    String getAuth(){
        return "Hello Auth";
    }
}