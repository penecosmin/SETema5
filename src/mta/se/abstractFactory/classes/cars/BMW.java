package mta.se.abstractFactory.classes.cars;

import mta.se.abstractFactory.classes.interfaces.*;

//se creaza clasa BMW folosind interfata ICar
public class BMW implements ICar {

	@Override
	public void schimbaUlei() {
		System.out.println("S-a schimbat uleiul la BMW.");
	}
}