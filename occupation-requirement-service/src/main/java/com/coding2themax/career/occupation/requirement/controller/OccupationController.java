package com.coding2themax.career.occupation.requirement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding2themax.persistance.occupation.model.Occupation;
import com.coding2themax.persistance.occupation.service.OccupationRepoService;

import reactor.core.publisher.Flux;

@RestController
public class OccupationController {

  private final OccupationRepoService occupationService;

  public OccupationController(OccupationRepoService occupationService) {
    this.occupationService = occupationService;
  }

  @GetMapping("/occupations")
  public Flux<Occupation> getAllOccupations() {
    return occupationService.findAll();
  }
}
