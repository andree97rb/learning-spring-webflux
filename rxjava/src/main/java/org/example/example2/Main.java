package org.example.example2;

import io.reactivex.Observable;

public class Main {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("1","2","3","4");
        observable.subscribe(new MyObserver());
    }
}
