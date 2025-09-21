package com.rewrite.example.checkstyle.integration.poc.controller;

import com.rewrite.example.checkstyle.integration.poc.model.GetAnimalsResponse;
import com.rewrite.example.checkstyle.integration.poc.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
@RequiredArgsConstructor
public class SampleController {

  private final SampleService sampleService;

  @GetMapping("")
  public GetAnimalsResponse getAnimals() {
    return sampleService.getAnimals();
  }
}
