package sitioWeb;

import java.util.ArrayList;
import java.util.List;

class Inquilino extends Usuario{
    private List<Reserva> reservas;
    private List<Reserva> reservasConfirmadas;
    
    List<Reserva> reservaEn(String ciudad){
    	List<Reserva> reservas = new ArrayList<>();
    	for (int i = 0; i < this.reservas; i++)
    		if (this.reservas.get(i).ciudad() == ciudad)
    				reservas = reservas.add(this.reservas.get(i));
    	return reservas;
    		
    }
    
    void CancelarReserva(Reserva reserva) {
    	this.reservas.remove(reserva);
    	// TODO aca falta todo el tramite de la cancelacion (politicas, borrar la reserva del sistema u otras clases).
    }
    
	List<Reserva> getReservas() {
		return reservas;
	}
	
	List<Reserva> getReservasConfirmadas() {
		return reservasConfirmadas;
	}
	
	
    
}
