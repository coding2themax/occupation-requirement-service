package com.coding2themax.persistance.occupation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.coding2themax.persistance.occupation.model.Occupation;
import com.coding2themax.persistance.occupation.repository.OccupationRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OccupationRepoService implements OccupationService {

  private final OccupationRepository occupationRepository;

  public OccupationRepoService(OccupationRepository occupationRepository) {
    this.occupationRepository = occupationRepository;
  }

  @Override
  public Mono<Occupation> findById(Long id) {
    return occupationRepository.findById(id);
  }

  @Override
  public Mono<Occupation> save(Occupation occupation) {
    return occupationRepository.save(occupation);
  }

  @Override
  public Flux<Occupation> findAll() {
    return occupationRepository.findAll();
  }

  @Override
  public void deleteById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
  }

  @Override
  public Mono<Occupation> update(Occupation occupation) {
    // TODO Auto-generated method stub
    return occupationRepository.save(occupation);
  }

  @Override
  public Mono<Occupation> findByName(String name) {
    return occupationRepository.findByName(name);
  }

  @Override
  public Mono<Occupation> findByDescription(String description) {
    return occupationRepository.findByDescription(description);
  }

}
