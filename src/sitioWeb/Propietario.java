package sitioWeb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

class Propietario extends Usuario{
    private List<Inmueble> inmueblesOfertados;
    private List<Reserva> reservasAConfirmar;
    private List<Reserva> reservasRealizadas;

    int vecesAlquilado(Inmueble propiedad) {
    	int vecesAlquilado = 0;
    	for (int i = 0; i < this.reservasAConfirmar.size(); i++)
    	    if (this.reservasAConfirmar.get(i).getInmueble() == propiedad)
    	    	vecesAlquilado++;
    	return vecesAlquilado;
    }
    
    int totalAlquileres() {
    	int total = 0;
    	for (int i = 0; i < this.reservasAConfirmar.size(); i++)
    		total++;
    	return total;
    }
    
    Period tiempoUsuario() {
    	LocalDate tiempoActual;
    	tiempoActual = LocalDate.now();
    	return Period.between(this.fechaDeIngreso, tiempoActual);
    }
    
    void verUsuario(Usuario inquilino) {
    	// TODO supongo q tiene q imprimir en pantalla los datos q se piden
    	// en cuanto a visualizacion
    }
    
    void ConfirmarReserva(Reserva reserva) {
    	// TODO falta implementar Reserva
    }
    
    void darInmuebleParaAlta(Inmueble nuevoInmueble) {
    	// TODO manda el alta de Sitio de un Inmueble que se quiere ofertar
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
