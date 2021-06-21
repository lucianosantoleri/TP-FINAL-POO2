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
    	reserva.getPoliticaCancelacion().cancelar(this);
    }
    
	List<Reserva> getReservas() {
		return reservas;
	}
	
	List<Reserva> getReservasConfirmadas() {
		return reservasConfirmadas;
	}   
}
