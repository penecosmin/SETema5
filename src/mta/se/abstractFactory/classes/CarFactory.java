package mta.se.abstractFactory.classes;

import mta.se.abstractFactory.classes.cars.*;
import mta.se.abstractFactory.classes.interfaces.*;

// clasa CarFactory este un factory care are la baza AbstractFactory
// va produce masini care provin din interfata ICar
public class CarFactory extends AbstractFactory {

	@Override
	public ICar getCar(String car) {
		if (car == null) {
			return null; 
		}
		if (car.equalsIgnoreCase("Mercedes")) {
			return new Mercedes(); //se creaza o masina Mercedes
		} else if (car.equalsIgnoreCase("BMW")) {
			return new BMW();  //se creaza un BMW
		}
		return null;
	}

	@Override
	IMoto getMoto(String moto) { 
		return null; // returneaza null pt ca acest factory produce masini, nu motociclete
	}
}