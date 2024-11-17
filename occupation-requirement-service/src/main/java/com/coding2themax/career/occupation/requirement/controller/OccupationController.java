package com.coding2themax.career.occupation.requirement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@RestController
public class OccupationController {

  @GetMapping("/hello")
  public Mono<ServerResponse> helloWorld(ServerRequest request) {
    return ServerResponse.ok().bodyValue("Hello World");
  }
}
