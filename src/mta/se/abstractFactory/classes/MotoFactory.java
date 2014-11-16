package mta.se.abstractFactory.classes;

import mta.se.abstractFactory.classes.moto.*;
import mta.se.abstractFactory.classes.interfaces.*;

//clasa MotoFactory este un factory care are la baza AbstractFactory
//va produce motociclete care provin din interfata IMoto
public class MotoFactory extends AbstractFactory {

	@Override
	public IMoto getMoto(String moto) {
		if (moto == null) {
			return null;
		}
		if (moto.equalsIgnoreCase("Honda")) {
			return new Honda(); //se creza o motocicleta Honda
		} else if (moto.equalsIgnoreCase("Yamaha")) {
			return new Yamaha(); //se creaza o motocicleta Yamaha
		} 
		return null;
	}

	@Override
	ICar getCar(String car) {
		return null;  //returneaza null pt ca acest factory produce motociclete, nu masini
	}
}