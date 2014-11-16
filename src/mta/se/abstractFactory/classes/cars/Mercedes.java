package mta.se.abstractFactory.classes.cars;

import mta.se.abstractFactory.classes.interfaces.*;

//se creaza clasa Mercedes folosind interfata ICar
public class Mercedes implements ICar {

	@Override
	public void schimbaUlei() {
		System.out.println("S-a schimbat uleiul la Mercedes.");
	}
}