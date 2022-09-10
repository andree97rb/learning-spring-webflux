package com.richand.example1;

import reactor.core.publisher.Mono;

public class MainMono {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Richard");
        mono.subscribe(System.out::println);

        Mono<Message> messageMono = Mono.justOrEmpty(new Message("My message"));
        messageMono.subscribe(System.out::println);

        Mono<String> stringMono = Mono.justOrEmpty(new Message("Andree").getText());
        stringMono.map(String::toUpperCase).subscribe(System.out::println);

    }
}
