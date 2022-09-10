package org.example.ex1;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Principal {
	public static void main(String[] args) {
		Observable<Cancion> emisora = Observable.just(new Cancion("We are the champions", "Queen"),
				new Cancion("Dream on", "Aerosmith"), new Cancion("Mutter", "Rammstein"));

		emisora.delay(5, TimeUnit.SECONDS).subscribe(new Fer());
		emisora.delay(5, TimeUnit.SECONDS).subscribe(new Nadia());
		emisora.delay(5, TimeUnit.SECONDS).subscribe(new Ant());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
