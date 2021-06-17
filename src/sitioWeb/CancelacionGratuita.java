package sitioWeb;

public class CancelacionGratuita implements PoliticaDeCancelacion {

	@Override
	public void cancelar(Inquilino inquilino, Propietario propietario) {
		if (!this.entraEnLapsoDeFechasCancelablesGratis(inquilino, propietario)) {
			inquilino.pagarEquivalenteADosDias(propietario);
		}
	}

	private boolean entraEnLapsoDeFechasCancelablesGratis(Inquilino inquilino, Propietario propietario) {
		return inquilino.fechaDeIngreso.get(null) > 10;
	}
}
