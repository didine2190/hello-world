package com.atridou.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/")
  public String getTest() {
    return "Hello World Amandine !";
  }

  @GetMapping("/hello_world")
  public String getHelloWorld() {
    return "Hello World !";
  }
}
