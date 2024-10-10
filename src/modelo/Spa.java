package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Spa extends Venta {

private LocalDate fecha2;
private LocalTime hora;
private int minutos;


public LocalDate getFecha2() {
	return fecha2;
}
public void setFecha2(LocalDate fecha2) {
	this.fecha2 = fecha2;
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
	this.fecha2 = fecha2;
	this.hora = hora;
	this.minutos = minutos;
}

public LocalTime salidaSpa() {
 
    LocalTime horaSalida = getHora().plusMinutes(getMinutos());
    return horaSalida;
}

@Override
public String toString() {
	return "\nSpa [fecha2=" + fecha2 + ", hora=" + hora + ", minutos=" + minutos + ", idVenta=" + idVenta + ", pasajero="
			+ pasajero + ", fecha=" + fecha + ", salidaSpa()=" + salidaSpa() + "]";
}





}
