package com.example.github_actions_test_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping("/")
  public String main(){
    return "This is manual deployment test server";
  }
}
