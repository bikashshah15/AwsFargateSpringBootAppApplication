package com.example.awsfargatespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class AwsFargateSpringBootAppApplication {
    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsFargateSpringBootAppApplication.class, args);
    }

}
