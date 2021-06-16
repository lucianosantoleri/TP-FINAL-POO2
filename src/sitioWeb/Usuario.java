package sitioWeb;

import java.time.LocalDate;


public abstract class Usuario {
    private String nombreCompleto;
    private String eMail;
    private String telefono;
    protected LocalDate fechaDeIngreso;
    private Ranking ranking;
    
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
    
    
}
