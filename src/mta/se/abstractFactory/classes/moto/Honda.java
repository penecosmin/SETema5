package mta.se.abstractFactory.classes.moto;

import mta.se.abstractFactory.classes.interfaces.*;

//se creaza clasa Honda folosind interfata IMoto
public class Honda implements IMoto {

	@Override
	public void schimbaLant() {
		System.out.println("S-a schimbat lantul la Honda.");
	}
}