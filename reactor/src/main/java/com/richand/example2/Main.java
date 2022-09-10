package com.richand.example2;

import reactor.core.publisher.Mono;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Richard").delayElement(Duration.ofSeconds(4));
        mono.subscribe(System.out::println);
        Mono<String> mono1 = Mono.just("Andree").delayElement(Duration.ofSeconds(3));
        mono1.subscribe(System.out::println);
        try{
            Thread.sleep(8000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
