package com.company.example;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController
{

  @GetMapping
  public Result getResult() {
    return null;
  }
  
}
