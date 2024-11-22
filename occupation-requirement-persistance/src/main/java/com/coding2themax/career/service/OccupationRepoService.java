package com.coding2themax.career.service;

import org.springframework.stereotype.Service;

import com.coding2themax.career.model.Occupation;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OccupationRepoService implements OccupationPersistanceService {

  @Override
  public Mono<Occupation> save(Occupation occupation) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

  @Override
  public Mono<Occupation> findById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
  }

  @Override
  public Flux<Occupation> findAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }

  @Override
  public void deleteById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
  }

  @Override
  public Mono<Occupation> update(Occupation occupation) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public Mono<Occupation> findByName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByName'");
  }

  @Override
  public Mono<Occupation> findByDescription(String description) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByDescription'");
  }

}
