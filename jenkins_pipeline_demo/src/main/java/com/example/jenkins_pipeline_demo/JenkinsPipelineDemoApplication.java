package com.example.jenkins_pipeline_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsPipelineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineDemoApplication.class, args);
	}

	@RequestMapping(value = "/name")
	public String getMessage() {
		return "Jenkins demo";
	}
}
