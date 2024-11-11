package com.coding2themax.persistance.occupation.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.coding2themax.persistance.occupation.model.Occupation;

import reactor.core.publisher.Mono;

@Repository
public interface OccupationRepository extends ReactiveCrudRepository<Occupation, Long> {
  Mono<Occupation> findByName(String name);

  Mono<Occupation> findByDescription(String description);

  Mono<Occupation> findByNameAndDescription(String name, String description);

}
