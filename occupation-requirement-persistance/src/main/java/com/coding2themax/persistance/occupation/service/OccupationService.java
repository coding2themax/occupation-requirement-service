package com.coding2themax.persistance.occupation.service;

import org.springframework.stereotype.Service;

import com.coding2themax.persistance.occupation.model.Occupation;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OccupationService {

  // Method to save an occupation
  Mono<Occupation> save(Occupation occupation);

  // Method to find an occupation by id
  Mono<Occupation> findById(Long id);

  // Method to find all occupations
  Flux<Occupation> findAll();

  // Method to delete an occupation by id
  void deleteById(Long id);

  // Method to update an occupation
  Mono<Occupation> update(Occupation occupation);

  // Method to find an occupation by name
  Mono<Occupation> findByName(String name);

  // Method to find an occupation by description
  Mono<Occupation> findByDescription(String description);
  // Method to find an occupation by name and description
}