package com.capgemini.spring_intro.controller;

import com.capgemini.spring_intro.dto.DtoMapper;
import com.capgemini.spring_intro.dto.User;
import com.capgemini.spring_intro.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post/user")
    public ResponseEntity<UserDto> postUser(@RequestBody User user){
        return new ResponseEntity<>(DtoMapper.mapToUserDto(user), HttpStatus.ACCEPTED);
    }
    
    @PutMapping("/hello/put/{name}")
    public ResponseEntity<String> getHello(@PathVariable String firstName, @RequestParam String lastName){
        return new ResponseEntity<>("Hello " + firstName + lastName + " from bridgelabz", HttpStatus.OK);
    }
}
