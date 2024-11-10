package com.coding2themax.career.occupation.requirement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding2themax.career.model.Occupation;
import com.coding2themax.career.service.OccupationService;

import reactor.core.publisher.Flux;

@RestController
public class OccupationController {

  private final OccupationService occupationService;

  public OccupationController(OccupationService occupationService) {
    this.occupationService = occupationService;
  }

  @GetMapping("/occupations")
  public Flux<Occupation> getAllOccupations() {
    return occupationService.findAll();
  }
}
