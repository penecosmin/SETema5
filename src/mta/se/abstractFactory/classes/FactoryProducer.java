package mta.se.abstractFactory.classes;


//clasa FactoryProducer va crea un factory de tip car sau moto in functie de parametrul introdus
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("car")) {
			return new CarFactory();  // creaza un factory de tip car
		} else if (choice.equalsIgnoreCase("moto")) {
			return new MotoFactory();  //creaza un factory de tip moto
		}
		return null;
	}
}