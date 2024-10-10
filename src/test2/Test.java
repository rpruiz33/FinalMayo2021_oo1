package test2;

import java.time.LocalDate;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sistema sistema= new Sistema ();
	sistema.agregarPasajero(11111111, "Romero", "Sol");
	sistema.agregarPasajero(22222222, "Martinesz", "Julian");
	System.out.println(sistema.getPasajeros());
	try {
		System.out.println(sistema.agregarEstadia(LocalDate.of(2021, 4, 7),sistema.getPasajeros().get(1),LocalDate.of(2021, 4, 4), 3, 3));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
