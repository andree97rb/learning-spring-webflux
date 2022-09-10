package org.example.example4;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);

        observable.subscribe(System.out::println);

        try{
            Thread.sleep(30000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
