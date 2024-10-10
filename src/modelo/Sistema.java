package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List<Pasajero> pasajeros;
private List<Venta>ventas;

public List<Pasajero> getPasajeros() {
	return pasajeros;
}
public void setPasajeros(List<Pasajero> pasajeros) {
	this.pasajeros = pasajeros;
}
public List<Venta> getVentas() {
	return ventas;
}
public void setVentas(List<Venta> ventas) {
	this.ventas = ventas;
}
public Sistema() {
	super();
	pasajeros=new ArrayList<Pasajero>();
	ventas=new ArrayList<Venta>();
}

public boolean agregarPasajero(long dni, String apellido, String nombre) {
	int id=1;
	if(pasajeros.size()>0) {
		id= pasajeros.get(pasajeros.size()-1).getIdPasajero()+1;
	}
	return pasajeros.add(new Pasajero( id, apellido,  nombre,(int) dni));
}

public boolean agregarEstadia(LocalDate fechaVenta, Pasajero pasajero, LocalDate checkIn, int cantNoches, int cantPlazas) throws Exception {
	int id=1;
	if(ventas.size()>0) {
		id=ventas.get(ventas.size()-1).getIdVenta()+1;
	}
	
	return ventas.add(new Estadia(id,  pasajero,fechaVenta,  checkIn,  cantNoches, cantPlazas));
}


}
