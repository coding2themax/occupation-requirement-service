package com.coding2themax.career.occupation_requirement_service.controller;

import org.springframework.web.bind.annotation.RestController;

import com.coding2themax.career.service.OccupationService;

@RestController
public class OccupationController {

  private final OccupationService occupationService;

  public OccupationController(OccupationService occupationService) {
    this.occupationService = occupationService;
  }
}
