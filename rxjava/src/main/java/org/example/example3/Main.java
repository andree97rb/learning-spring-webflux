package org.example.example3;

import io.reactivex.Observable;

public class Main {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("tic","tac","toe");
        observable.map(String::toUpperCase).subscribe(System.out::println);
    }
}
