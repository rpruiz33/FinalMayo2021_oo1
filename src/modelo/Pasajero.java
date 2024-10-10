package modelo;

public class Pasajero {
private int idPasajero;
private String Apellido;
private String Nombre;
private int Dni;
public int getIdPasajero() {
	return idPasajero;
}
public void setIdPasajero(int idPasajero) {
	this.idPasajero = idPasajero;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getDni() {
	return Dni;
}
public void setDni(int dni) {
	Dni = dni;
}
public Pasajero(int idPasajero, String apellido, String nombre, int dni) {
	super();
	this.idPasajero = idPasajero;
	Apellido = apellido;
	Nombre = nombre;
	Dni = dni;
}
@Override
public String toString() {
	return "Pasajero [idPasajero=" + idPasajero + ", Apellido=" + Apellido + ", Nombre=" + Nombre + ", Dni=" + Dni
			+ "]";
}
/*agregarEstadia(LocalDate fechaVenta, Pasajero pasajero, LocalDate checkIn, int cantNoches, int
cantPlazas):boolean*/


}