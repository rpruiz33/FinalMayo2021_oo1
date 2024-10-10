package modelo;

import java.time.LocalDate;

public class Estadia extends Venta {

private LocalDate chekIn;
private int cantNoches;
private int  CantDePlazas;
public LocalDate getChekIn() {
	return chekIn;
}
public void setChekIn(LocalDate chekIn) throws Exception{
	if(chekIn.isBefore(fecha)){
		 throw new Exception("la fecha es menor");
	}
	this.chekIn=chekIn;
}
public int getCantNoches() {
	return cantNoches;
}
public void setCantNoches(int cantNoches) {
	this.cantNoches = cantNoches;
}
public int getCantDePlazas() {
	return CantDePlazas;
}
public void setCantDePlazas(int cantDePlazas) {
	CantDePlazas = cantDePlazas;
}
public Estadia(int idVenta, Pasajero pasajero, LocalDate fecha, LocalDate chekIn, int cantNoches, int cantDePlazas) throws Exception {
	super(idVenta, pasajero, fecha);
	setChekIn(chekIn);
	this.cantNoches = cantNoches;
	CantDePlazas = cantDePlazas;
}

@Override
public String toString() {
	return "\nEstadia [chekIn=" + chekIn + ", cantNoches=" + cantNoches + ", CantDePlazas=" + CantDePlazas
			+ ", idVenta=" + idVenta + ", pasajero=" + pasajero + ", fecha=" + fecha + "]";
}

}
