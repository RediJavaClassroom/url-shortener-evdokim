package com.redi.shortener.controller;

import java.time.Instant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
  @GetMapping("/time")
  public String greet() {
    return Instant.now().toString();
  }
}
