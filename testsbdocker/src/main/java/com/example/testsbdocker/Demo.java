package com.example.testsbdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Malla reddy College";
    }
}
