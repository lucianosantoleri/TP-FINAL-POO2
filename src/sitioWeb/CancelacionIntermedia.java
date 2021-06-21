package sitioWeb;

public class CancelacionIntermedia implements PoliticaDeCancelacion {

	@Override
	public void cancelar(Usuario usuario) {
		if (!this.entraEnLapsoDeFechasCancelablesGratis(usuario)) {
			if (entraEnLapsoDeCincuentaPorCiento(usuario)) {
				usuario.setPago(Pago.CINCUENTAPORCIENTORESERVA);
			}
			else {
				usuario.setPago(Pago.TOTALIDAD);
			}
		}
	}
	
	private boolean entraEnLapsoDeFechasCancelablesGratis(Usuario usuario) {
		return usuario.fechaDeIngreso.get(null) > 20;
	}
	
	private boolean entraEnLapsoDeCincuentaPorCiento(Usuario usuario) {
		return  this.comparandoConDiaMaximo(usuario) && this.comparandoConDiaMinimo(usuario);
	}
	
	private boolean comparandoConDiaMaximo(Usuario usuario) {
		return  19 > usuario.fechaDeIngreso.get(null);
	}
	
	private boolean comparandoConDiaMinimo(Usuario usuario) {
		return  usuario.fechaDeIngreso.get(null) > 10;
	}
}
