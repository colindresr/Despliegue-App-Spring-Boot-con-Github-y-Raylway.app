package com.ralyway.despliegue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {

    @GetMapping("/name")
    public String getName() {
        return "Ricardo Colindres";
    }
}