package com.bridgelabz.greetingapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.services.IGreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Data.UserData;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    
    @GetMapping(value={"/","","/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @Autowired
    private IGreetingService greetingService;
    
    @GetMapping("/service")
    public Greeting greeting() {
    	return greetingService.greetingMessage();
    }
	
    @PostMapping("/post")
    public String greetingMessage(@RequestBody UserData userData) {
        return greetingService.greetingMessageByName(userData);
        }
}
