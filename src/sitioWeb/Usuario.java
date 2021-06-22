package sitioWeb;

import java.time.LocalDate;
import java.util.List;


public abstract class Usuario {
	private ISitioWeb sitio;
	private String nombreCompleto;
    private String eMail;
    private String telefono;
    protected LocalDate fechaDeIngreso;
    private Ranking ranking;
    private Pago pago;
    
    List<Inmueble> buscar(String ciudad, LocalDate entrada, LocalDate salida, int capacidad, int precioMin, int precioMax) {
    	return this.sitio.buscar(ciudad, entrada, salida, capacidad, precioMin, precioMax);
    }
    
    void visualizar(Inmueble inmueble) {
    	sitio.visualizar(inmueble);
    }
    
	String getNombreCompleto() {
		return nombreCompleto;
	}
	
	void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	String geteMail() {
		return eMail;
	}
	
	void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	String getTelefono() {
		return telefono;
	}
	
	void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	
	void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	Ranking getRanking() {
		return ranking;
	}
	
	void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
}
