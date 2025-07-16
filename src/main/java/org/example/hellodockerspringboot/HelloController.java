package org.example.hellodockerspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * http://localhost:8085/hello
     * */
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Dockerized Spring Boot!";
    }
}
