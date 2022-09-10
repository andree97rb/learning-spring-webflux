package com.richand.webFlux.controller;

import com.richand.webFlux.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public Mono<String> hello(){
        return helloService.hello();
    }

    @GetMapping("/hello2")
    public Mono<String> hello2(){
        return helloService.hello2();
    }

    @GetMapping("/hellojoin")
    public Flux<String> hellojoin(){
        long t1 = System.currentTimeMillis();
        Mono<String> hello = helloService.hello();
        Mono<String> hello2 = helloService.hello2();
        long t2 = System.currentTimeMillis();
        System.out.println("Total time :" + (t2-t1)); 
        Flux<String> merge = Flux.merge(hello, hello2);
        return  merge;
    }

}
