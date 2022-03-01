package com.rama.spring.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {
  @RequestMapping(value = "/greet", method = RequestMethod.GET)
  @ResponseBody
  public String currentUserName() {
    return "Hello";
  }

  @GetMapping("/greet/{name}")
  public String getPathVar(@PathVariable("name") String name) {
    return "Hello:" + name;
  }

  @GetMapping("/java")
  public String getPathVar() {
    return "Hello from java";
  }
}


