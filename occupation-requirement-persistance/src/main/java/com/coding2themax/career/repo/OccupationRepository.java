package com.coding2themax.career.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.coding2themax.career.model.Occupation;

import reactor.core.publisher.Mono;

public interface OccupationRepository extends ReactiveCrudRepository<Occupation, Long> {
  Mono<Occupation> findByName(String name);

  Mono<Occupation> findByDescription(String description);

}