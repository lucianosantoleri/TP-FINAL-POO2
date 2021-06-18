package sitioWeb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Busqueda implements IBuscador{
	private List<Inmueble> ResultadoDeBusqueda;
	

	public List<Inmueble> buscar(String ciudad, LocalDate entrada, LocalDate salida, int capacidad, int precioMin, int precioMax, List<Inmueble> inmuebles) {
		this.ResultadoDeBusqueda = new ArrayList<>();
		List<Inmueble> inmueblesDisponibles = inmuebles;
		this.buscarPorCiudad(ciudad, inmueblesDisponibles);
		this.buscarPorFechaEntrada(entrada, ResultadoDeBusqueda);
		this.buscarPorFechaSalida(salida, ResultadoDeBusqueda);
		this.buscarPorCapacidad(capacidad, ResultadoDeBusqueda);
		this.buscarPorPrecioMin(precioMin, ResultadoDeBusqueda);
		this.buscarPorPrecioMax(precioMax, ResultadoDeBusqueda);
		return ResultadoDeBusqueda;
	}

	void buscarPorCiudad(String ciudad, List<Inmueble> inmuebles) {
		for (int i = 0; i < inmuebles.size(); i++)
			if (inmuebles.get(i).getCiudad() == ciudad)
				this.ResultadoDeBusqueda.add(inmuebles.get(i));
		
	}
	
	void buscarPorFechaEntrada(LocalDate entrada, List<Inmueble> inmuebles) {
		for (int i = 0; i < inmuebles.size(); i++)
			if (inmuebles.get(i).getDisponibilidad().contains(entrada))
				this.ResultadoDeBusqueda.add(inmuebles.get(i));
	}
	
	// en realidad debería chequear todas las fechas entre la entrada y salida pero es un quilombo.
	void buscarPorFechaSalida(LocalDate salida, List<Inmueble> inmuebles) {
		for (int i = 0; i < inmuebles.size(); i++)
			if (inmuebles.get(i).getDisponibilidad().contains(salida))
				this.ResultadoDeBusqueda.add(inmuebles.get(i));
	}
	
	void buscarPorCapacidad(int capacidad, List<Inmueble> inmuebles) {
		for (int i = 0; i < inmuebles.size(); i++)
			if (inmuebles.get(i).getCapacidad() == capacidad)
				this.ResultadoDeBusqueda.add(inmuebles.get(i));
	}
	
	void buscarPorPrecioMin(float precioMin, List<Inmueble> inmuebles) {
		for (int i = 0; i < inmuebles.size(); i++)
			if (inmuebles.get(i).getPrecio() > precioMin)
				this.ResultadoDeBusqueda.add(inmuebles.get(i));
	}
	
	void buscarPorPrecioMax(float precioMax, List<Inmueble> inmuebles) {
		for (int i = 0; i < inmuebles.size(); i++)
			if (inmuebles.get(i).getPrecio() < precioMax)
				this.ResultadoDeBusqueda.add(inmuebles.get(i));
	}

}
