package com.example.greetings.controllers;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;
@Slf4j
@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> greetings(){
        return ResponseEntity.ok("Bem vindo!");
    }
    @GetMapping("/log")
    public ResponseEntity<String> logging(){
        log.info("m=logging, c=GreetingController, message={Logando os testes}");
        return ResponseEntity.ok("Olhe o Log da aplicação");
    }

}
