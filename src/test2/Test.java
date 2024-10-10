package test2;

import java.time.LocalDate;
import java.time.LocalTime;



import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sistema sistema= new Sistema ();
	System.out.println(sistema.agregarPasajero(11111111, "Romero", "Sol"));
	System.out.println(sistema.agregarPasajero(22222222, "Martinesz", "Julian"));
	System.out.println("1");
	System.out.println(sistema.getPasajeros());
	System.out.println("2");
	try {
		System.out.println(sistema.agregarEstadia(LocalDate.of(2021, 4, 7),sistema.getPasajeros().get(1),LocalDate.of(2021, 4, 4), 3, 3));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(3);
	try {
		System.out.println(sistema.agregarEstadia(LocalDate.of(2021, 4, 7),sistema.getPasajeros().get(1),LocalDate.of(2021, 4, 11), 3, 3));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	 
	System.out.println(sistema.agregarSpa(LocalDate.of(2021, 4, 13), sistema.getPasajeros().get(1), LocalDate.of(2021, 4, 7),LocalTime.of(16,10 ), 90));
	
	try {
		System.out.println(sistema.agregarEstadia(LocalDate.of(2021, 4, 8),sistema.getPasajeros().get(0),LocalDate.of(2021, 4, 13), 4, 2));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		
	}
	System.out.println(sistema.agregarSpa(LocalDate.of(2021, 4, 13), sistema.getPasajeros().get(0), LocalDate.of(2021, 4, 8),LocalTime.of(15,30 ), 45));
	System.out.println(sistema.getVentas().toString()) ;
	System.out.println("4");
	System.out.println(sistema.traerVenta(2).toString());
	System.out.println("5");
	System.out.println(sistema.traerSpa(LocalDate.of(2021,4,13), LocalTime.of(16,10)));
	System.out.println("6");
	System.out.println(sistema.traerSpa(LocalDate.of(2021,4,13), LocalTime.of(17,40)));

	
	
	}
	
	
}
