package com.example.licunfruit.controller;

import com.example.licunfruit.service.UserService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public ResponseEntity test (){
        log.info(userService.findUserByUsername("root").getUsername());
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/testName")
    public ResponseEntity testName (){
        System.out.println(new Gson().toJson(userService.findUserByUsername("root")));
        return new ResponseEntity(HttpStatus.OK);
    }
}
