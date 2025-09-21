package com.rewrite.example.checkstyle.integration.poc.service;

import com.rewrite.example.checkstyle.integration.poc.model.Animal;
import com.rewrite.example.checkstyle.integration.poc.model.GetAnimalsResponse;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

  public GetAnimalsResponse getAnimals() {
    return new GetAnimalsResponse(
        List.of(
            new Animal("cat"),
            new Animal("dog")
        )
    );
  }
}
