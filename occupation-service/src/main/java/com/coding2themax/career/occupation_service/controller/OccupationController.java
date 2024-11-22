package com.coding2themax.career.occupation_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coding2themax.career.model.Occupation;
import com.coding2themax.career.service.OccupationPersistanceService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/occupation")
public class OccupationController {

  private final OccupationPersistanceService occupationService;

  public OccupationController(OccupationPersistanceService occupationService) {
    this.occupationService = occupationService;
  }

  @GetMapping
  public Flux<Occupation> getOccupations() {
    return occupationService.findAll();
  }

  @GetMapping("/{id}")
  public Mono<Occupation> getOccupation(@PathVariable Long id) {
    return occupationService.findById(id);
  }

  @PostMapping
  public Mono<Occupation> createOccupation(@RequestBody Occupation occupation) {
    return occupationService.save(occupation);
  }

  @PutMapping("/{id}")
  public Mono<Occupation> updateOccupation(@PathVariable Long id, @RequestBody Occupation occupation) {
    return occupationService.update(occupation);
  }

  @DeleteMapping("/{id}")
  public void deleteOccupation(@PathVariable Long id) {
    occupationService.deleteById(id);
  }

}
