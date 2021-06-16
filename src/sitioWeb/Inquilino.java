package sitioWeb;

import java.util.ArrayList;
import java.util.List;

class Inquilino extends Usuario{
    private List<Reserva> reservas;
    private List<Reserva> reservasConfirmadas;
    
    List<Reserva> reservaEn(String ciudad){
    	List<Reserva> reservasEn = new ArrayList<>();
    	for (int i = 0; i < this.reservas.size(); i++)
    		if (this.reservas.get(i).ciudad() == ciudad)
    			reservasEn.add(this.reservas.get(i));
    	return reservasEn;
    		
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

	public void pagarEquivalenteADosDias(Propietario propietario) {
		
	}

	//Este metodo es cuando hay que cumplir con la politica de cancelacion gratuita
	public void pagarEquivalenteADosDias(Propietario propietario) {
		// Chequear como se puede realizar los pagos
		
	}
	
	
    
}
