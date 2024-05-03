package com.go4it.playwithgithub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world!");
    }

    @GetMapping("/hello-world/{name}")
    public ResponseEntity<String> helloWorld(@PathVariable String name) {
        return ResponseEntity.ok("Hello world, " + name + "!");
    }

}
