package org.example.example2;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MyObserver implements Observer {
    @Override
    public void onSubscribe(Disposable disposable) {
        System.out.println("We're subscribed");
    }

    @Override
    public void onNext(Object o) {
        System.out.println(o);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error");
    }

    @Override
    public void onComplete() {
        System.out.println("FINISH");
    }
}