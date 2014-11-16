package mta.se.abstractFactory.classes;

import mta.se.abstractFactory.classes.interfaces.*;

//clasa abstracta AbstractFactory care va fi folosita pentru implemantarea CarFactory si MotoFactory
public abstract class AbstractFactory {

	//se va crea ori o masina, ori o motocicleta 
	abstract ICar getCar(String car); //
	abstract IMoto getMoto(String moto);
}
