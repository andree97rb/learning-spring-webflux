package com.richand.webFlux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class HelloService {
    public Mono<String> hello(){
        return Mono.just("hello async hello()").delayElement(Duration.ofSeconds(3));
    }

    public Mono<String> hello2(){
        return Mono.just("hello async hello2()").delayElement(Duration.ofSeconds(3));
    }

}
