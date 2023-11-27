package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/message")
    String hello() {
        return "Hello World, Spring Boot! I have deployed azure successfully";
    }

}