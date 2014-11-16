package mta.se.abstractFactory.classes.moto;

import mta.se.abstractFactory.classes.interfaces.*;

//se creaza clasa Yamaha folosind interfata IMoto
public class Yamaha implements IMoto {

	@Override
	public void schimbaLant() {
		System.out.println("S-a schimbat lantul la Yamaha.");
	}
}