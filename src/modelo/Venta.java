package modelo;

import java.time.LocalDate;

public abstract class Venta {
protected int idVenta;
protected Pasajero pasajero;
protected LocalDate fecha;
public Venta(int idVenta, Pasajero pasajero, LocalDate fecha) {
	super();
	this.idVenta = idVenta;
	this.pasajero = pasajero;
	this.fecha = fecha;
}
@Override
public String toString() {
	return "Venta [idVenta=" + idVenta + ", pasajero=" + pasajero + ", fecha=" + fecha + ", getIdVenta()="
			+ getIdVenta() + ", getPasajero()=" + getPasajero() + ", getFecha()=" + getFecha() + "]";
}
public int getIdVenta() {
	return idVenta;
}
public void setIdVenta(int idVenta) {
	this.idVenta = idVenta;
}
public Pasajero getPasajero() {
	return pasajero;
}
public void setPasajero(Pasajero pasajero) {
	this.pasajero = pasajero;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}


}
