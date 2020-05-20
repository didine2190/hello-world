package com.atridou.HelloWorld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @Value( "${propriete.test}" )
  private String test;
  @Value( "${propriete.test2}" )
  private String test2;

  @GetMapping("/")
  public String getTest() {
    return "Hello World Amandine !";
  }

  @GetMapping("/hello_world")
  public String getHelloWorld() {
    return test;
  }


  @GetMapping("/hello_world2")
  public String getHelloWorld2() {
    return test2;
  }

  @GetMapping("/hello_world3")
  public String getHelloWorld3() {
    return "Test";
  }

}
