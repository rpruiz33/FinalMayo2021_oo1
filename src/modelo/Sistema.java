package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
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
	
	return  ventas.add(new Estadia(id,  pasajero,fechaVenta,  checkIn,  cantNoches, cantPlazas));
}
/*agregarSpa(LocalDate fechaVenta, Pasajero pasajero, LocalDate fecha, LocalTime hora, int
minutos) : boolean*/

public boolean agregarSpa (LocalDate fechaVenta, Pasajero pasajero, LocalDate fecha, LocalTime hora, int minutos) {
int id=1;
if(ventas.size()>0) {
	id=ventas.get(ventas.size()-1).getIdVenta()+1;
}

return  ventas.add(new Spa( id,  pasajero,fechaVenta,  fecha,  hora,  minutos));
}

/*traerVenta(int idVenta):Venta //con todos sus atributos*/
public Venta traerVenta(int idVenta) {
	Venta venta=null;
	int i=0;
	while(i<ventas.size()&&venta==null) {
	if(ventas.get(i).getIdVenta()==idVenta) {
	venta=ventas.get(i);
	}
	i++;
	}
	return venta;
	}
/*List<Spa> traerSpa(LocalDate dia, LocalTime hora) // trae todos los objetos Spa que se
encuentran activas (se encuentran en el Spa) para ese día y la hora se encuentra entre hora
entrada y salida al spa inclusive*/
public List<Spa> traerSpa(LocalDate dia, LocalTime hora){
	List<Spa> SPA=new ArrayList<Spa>();
	Spa venta=null;
	for(int i=0;i<ventas.size();i++) {
		 if (ventas.get(i) instanceof Spa) {
		
		venta=(Spa)ventas.get(i);
		 
        if (venta.getFecha().equals(dia) && 
                (hora.equals(venta.getHora()) || hora.equals(venta.salidaSpa()) || 
                 (hora.isAfter(venta.getHora()) && hora.isBefore(venta.salidaSpa())))) {
			
		SPA.add(venta);
			
		}
	}
	}
	return SPA;
	
}
}



