package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class App2Controller {

  @Get(value = "/", produces = MediaType.TEXT_PLAIN)
  public String index() {
    return "Hello from App2!";
  }
}
