package com.example.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController is a convenience annotation that does nothing more than adding the @Controller and @ResponseBody annotations
@RestController
public class DemoController {

    // test docker api
    @GetMapping("/test-docker")
    public String testDocker() {
        return "Hello DockerDemo!";
    }

}
