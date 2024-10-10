package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Spa extends Venta {
private LocalDate fecha;
private LocalTime hora;
private int minutos;
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public LocalTime getHora() {
	return hora;
}
public void setHora(LocalTime hora) {
	this.hora = hora;
}
public int getMinutos() {
	return minutos;
}
public void setMinutos(int minutos) {
	this.minutos = minutos;
}
public Spa(int idVenta, Pasajero pasajero, LocalDate fecha, LocalDate fecha2, LocalTime hora, int minutos) {
	super(idVenta, pasajero, fecha);
	fecha = fecha2;
	this.hora = hora;
	this.minutos = minutos;
}

public LocalTime salidaSpa() {
	return LocalTime.of(getHora().getHour(),getHora().getMinute()+ getMinutos());
}





}
