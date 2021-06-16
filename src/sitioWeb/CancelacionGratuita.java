package sitioWeb;

public class CancelacionGratuita implements PoliticaDeCancelacion {

	@Override
	public void cancelar(Inquilino inquilino, Propietario propietario) {
		if (!this.entraEnLapsoDeFechasCancelablesGratis(inquilino)) {
			inquilino.pagarEquivalenteADosDias(propietario);
		}
	}

	private boolean entraEnLapsoDeFechasCancelablesGratis(Inquilino inquilino) {
		return inquilino.fechaDeIngreso > 10; // voy a revisar comparativas en fechas y dias
	}
}
