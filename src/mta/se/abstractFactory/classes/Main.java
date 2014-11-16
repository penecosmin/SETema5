package mta.se.abstractFactory.classes;

import mta.se.abstractFactory.classes.interfaces.ICar;
import mta.se.abstractFactory.classes.interfaces.IMoto;

public class Main {
	public static void main(String[] args) {

		// se creaza un factory de tip 'car'
		AbstractFactory CarFactory = FactoryProducer.getFactory("car");

		// folosind factory creat mai sus, se creaza o masina de tip Mercedes
		ICar mercedes = CarFactory.getCar("Mercedes");

		// se schimba uleiul la Mercedes
		mercedes.schimbaUlei();

		// folosind acelasi factory creat mai sus, se creaza o masina de tip BMW
		ICar bmw = CarFactory.getCar("BMW");

		// se schimba uleiul la BMW
		bmw.schimbaUlei();

		// se creaza un factory de tip 'moto'
		AbstractFactory MotoFactory = FactoryProducer.getFactory("moto");

		// folosind factory MotoFactory se creaza o motocicleta Honda
		IMoto honda = MotoFactory.getMoto("Honda");

		// se schimba lantul la Honda
		honda.schimbaLant();

		// folosind factory MotoFactory se creaza o motocicleta Yamaha
		IMoto yamaha = MotoFactory.getMoto("Yamaha");

		// se schimba lantul la Yamaha
		yamaha.schimbaLant();
	}
}