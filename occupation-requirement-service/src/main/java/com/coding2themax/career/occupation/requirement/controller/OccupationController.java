package com.coding2themax.career.occupation.requirement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.coding2themax.persistance.occupation.model.Occupation;
import com.coding2themax.persistance.occupation.service.OccupationRepoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

  @GetMapping("/occupations/{id}")
  public Mono<ServerResponse> getOccupation(ServerRequest request) {
    return occupationService.findById(Long.parseLong(request.pathVariable("id")))
        .flatMap(occupation -> ServerResponse.ok().bodyValue(occupation))
        .switchIfEmpty(ServerResponse.notFound().build());
  }

  @GetMapping("/hello")
  public Mono<ServerResponse> helloWorld(ServerRequest request) {
    return ServerResponse.ok().bodyValue("Hello World");
  }
}
