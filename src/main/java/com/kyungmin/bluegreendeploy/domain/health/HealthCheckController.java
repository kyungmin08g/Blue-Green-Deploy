package com.kyungmin.bluegreendeploy.domain.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  @GetMapping(value = "/health")
  public String health() {
    return "OK (first)";
  }
}
