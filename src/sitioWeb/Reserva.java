package sitioWeb;

import sitioWeb.Administrador.FormaDePago;

class Reserva {
    private Inmueble inmueble;
    private Inquilino inquilino;
    private Propietario propietario;
    private FormaDePago formaDePago;
 // private PoliticaDeCancelacion politicaCancelacion; // TODO falta implementar las politicas de cancelacion
    private boolean enEspera;
    
    public Reserva(Inmueble alquiler, Inquilino inquilino, Propietario propietario, FormaDePago formaPago, PoliticaDeCancelacion politicaCancelacion) {
    	setReserva(alquiler, inquilino, propietario, formaPago, politicaCancelacion);
    	enEspera = true;
    }
    
    void setReserva(Inmueble alquiler, Inquilino inquilino, Propietario propietario, FormaDePago formaPago, PoliticaDeCancelacion politicaCancelacion) {
    	this.setAlquiler(alquiler);
    	this.setInquilino(inquilino);
    	this.setPropietario(propietario);
    	this.setFormaDePago(formaPago);
    	this.setPoliticaCancelacion(politicaCancelacion);
    }
    
    String ciudad() {
    	return this.inmueble.getCiudad();
    }
    
	Inmueble getInmueble() {
		return inmueble;
	}
	
	void setAlquiler(Inmueble alquiler) {
		this.inmueble = alquiler;
	}
	
	Inquilino getInquilino() {
		return inquilino;
	}
	
	void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}
	
	Propietario getPropietario() {
		return propietario;
	}
	
	void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	FormaDePago getFormaDePago() {
		return formaDePago;
	}
	
	void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	/*
	PoliticaDeCancelacion getPoliticaCancelacion() {
		return politicaCancelacion;
	}
	
	void setPoliticaCancelacion(PoliticaDeCancelacion politicaCancelacion) {
		this.politicaCancelacion = politicaCancelacion;
	}
	*/
	
	boolean isEnEspera() {
		return enEspera;
	}

}
