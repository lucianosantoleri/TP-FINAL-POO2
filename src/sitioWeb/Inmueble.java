package sitioWeb;

import java.time.LocalDate;
import java.util.List;

import sitioWeb.Administrador.FormaDePago;
import sitioWeb.Administrador.Servicio;
import sitioWeb.Administrador.TipoDeInmueble;

class Inmueble {
    private Usuario propietario;  
    private TipoDeInmueble tipo; // los tipos los implementa el administrador del sitio
    private float superficie;
    private String pais;
    private String ciudad;
    private String direccion;
    private List<Servicio> servicios; // los servicios los implementa el administrador del sitio
    private int capacidad;
 // private ???? fotos;
    private int checkIn; // TODO acá podría ser Time o algo así (a investigar) o simplemente un int con la hora
    private int checkOut;
    private List<FormaDePago> formasDePago; // implementado en el administrador del sitio
    private float precio;
 // private PoliticaDeCancelacion politicaCancelacion; // TODO falta definir las 3 politicas de cancelacion
    private List<LocalDate> disponibilidad;
    

	private Ranking ranking;
    private List<String> comentarios;
    
	
    public Inmueble() {
    // TODO 	
    }
    
    void agregarFormaDePago(FormaDePago pago) {
        if (! this.formasDePago.contains(pago))
            this.formasDePago.add(pago);
    }
    
    void sacarFormaDePago(FormaDePago pago) {
        if (this.formasDePago.contains(pago))
        	this.formasDePago.remove(pago);
    }
    
    void agregarComentario(String comentario) {
    	this.comentarios.add(comentario);
    }

	float getSuperficie() {
		return superficie;
	}

	void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	String getPais() {
		return pais;
	}

	void setPais(String pais) {
		this.pais = pais;
	}

	String getCiudad() {
		return ciudad;
	}


	void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	String getDireccion() {
		return direccion;
	}

	void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	int getCapacidad() {
		return capacidad;
	}

	void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	int getCheckIn() {
		return checkIn;
	}

	void setCheckIn(int checkIn) {
		this.checkIn = checkIn;
	}

	int getCheckOut() {
		return checkOut;
	}

	void setCheckOut(int checkOut) {
		this.checkOut = checkOut;
	}

	float getPrecio() {
		return precio;
	}

	void setPrecio(float precio) {
		this.precio = precio;
	}

	Ranking getRanking() {
		return ranking;
	}

	void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	List<String> getComentarios() {
		return comentarios;
	}

	void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}
	
	List<LocalDate> getDisponibilidad() {
		return disponibilidad;
	}
	
	// debería agregar una fecha disponible para reserva
	void addFechaDisponible(LocalDate fecha) {
		this.disponibilidad.add(fecha);
	}
	
	// debería borrar una fecha disponible para reserva cuando esta se reserva.
	void removeFechaDisponible(LocalDate fecha) {
		this.disponibilidad.remove(fecha);
	}
      
}