package com.richand.example1;

import reactor.core.publisher.Flux;

public class MainFlux {
    public static void main(String[] args) {
        Flux<String> stringFlux = Flux.just("Richard","Andree");
        stringFlux.subscribe(System.out::println);
        stringFlux.subscribe(r-> System.out.println(r.repeat(21)));
    }
}
