package com.rewrite.example.checkstyle.integration.poc.model;

import java.util.List;
import lombok.Value;

@Value
public class GetAnimalsResponse {
  List<Animal> animals;
}
