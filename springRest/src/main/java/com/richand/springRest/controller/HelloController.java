package com.richand.springRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.richand.springRest.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        long t1 = System.currentTimeMillis();
        return helloService.hello();

    }

    @GetMapping("/hello2")
    public String hello2(){
        long t1 = System.currentTimeMillis();
        return helloService.hello2();
    }

    @GetMapping("/hellojoin")
    public String hellojoin(){
        long t1 = System.currentTimeMillis();
        String text = helloService.hello() + " " + helloService.hello2();
        long t2 = System.currentTimeMillis();
        System.out.println("Total millis: " + (t2 - t1));
        return text;
    }

}
