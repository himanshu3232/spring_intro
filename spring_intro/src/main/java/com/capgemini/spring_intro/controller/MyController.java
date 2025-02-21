package com.capgemini.spring_intro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hello from bridgelabz", HttpStatus.OK);
    }

    @GetMapping("/hello/query")
    public ResponseEntity<String> getHello(@RequestParam String name){
        return new ResponseEntity<>("Hello " + name + " from bridgelabz", HttpStatus.OK);
    }

    @GetMapping("/hello/param/{name}")
    public ResponseEntity<String> hello(@RequestParam String name){
        return new ResponseEntity<>("Hello " + name + " from bridgelabz", HttpStatus.OK);
    }
}
