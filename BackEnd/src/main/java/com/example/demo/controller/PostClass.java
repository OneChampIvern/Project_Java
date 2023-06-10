package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
public class PostClass {
//  @PostMapping Mapping(value = "/post")
  public String helloString(){
    return "hello string";
  }
}
