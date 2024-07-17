package com.example.jenkins_pipeline_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/demo")
    public String demoEndpoint() {
        return "jenkins demo";
    }
}
