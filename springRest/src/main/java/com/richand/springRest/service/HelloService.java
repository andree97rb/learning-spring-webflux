package com.richand.springRest.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService{
    public String hello(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "sync hello()";
    }

    public String hello2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "sync hello2()";
    }
}
