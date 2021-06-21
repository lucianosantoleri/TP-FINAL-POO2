package sitioWeb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

class Propietario extends Usuario{
    private List<Inmueble> inmueblesOfertados;
    private List<Reserva> reservasAConfirmar;
    private List<Reserva> reservasRealizadas;

    public int vecesAlquilado(Inmueble propiedad) {
    	int vecesAlquilado = 0;
    	for (int i = 0; i < this.reservasAConfirmar.size(); i++)
    	    if (this.reservasAConfirmar.get(i).getInmueble() == propiedad)
    	    	vecesAlquilado++;
    	return vecesAlquilado;
    }
    
    public int totalAlquileres() {
    	int total = 0;
    	for (int i = 0; i < this.reservasAConfirmar.size(); i++)
    		total++;
    	return total;
    }
    
    public Period tiempoUsuario() {
    	LocalDate tiempoActual;
    	tiempoActual = LocalDate.now();
    	return Period.between(this.fechaDeIngreso, tiempoActual);
    }
    
    public void verUsuario(Usuario inquilino) {
    	//supongo que tiene q imprimir en pantalla los datos q se piden
    	// en cuanto a visualizacion
    }
    
    public void ConfirmarReserva(Reserva reserva) {
    	this.reservasRealizadas.add(reserva);
    }
    
    public void inmuebleParaAlta(Inmueble nuevoInmueble) {
    	// manda el alta de Sitio de un Inmueble que se quiere ofertar
    }
    
	List<Inmueble> getInmueblesOfertados() {
		return inmueblesOfertados;
	}
	
	List<Reserva> getReservasAConfirmar() {
		return reservasAConfirmar;
	}
	
	List<Reserva> getReservasRealizadas() {
		return reservasRealizadas;
	}
    
}
