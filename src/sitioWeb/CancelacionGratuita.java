package sitioWeb;

public class CancelacionGratuita implements PoliticaDeCancelacion {

	@Override
	public void cancelar(Usuario usuario) {
		if (!this.entraEnLapsoDeFechasCancelablesGratis(usuario)) {
			usuario.setPago(Pago.DOSDIASRESERVA);
		}
	}

	private boolean entraEnLapsoDeFechasCancelablesGratis(Usuario usuario) {
		return usuario.fechaDeIngreso.get(null) > 10;
	}
}
