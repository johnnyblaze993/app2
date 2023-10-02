package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/App2")
public class App2Controller {

    @Get("/")
    public String index() {
        return "Hello from App2!";
    }
}