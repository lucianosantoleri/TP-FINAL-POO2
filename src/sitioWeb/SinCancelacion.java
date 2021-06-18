package sitioWeb;

public class SinCancelacion implements PoliticaDeCancelacion {

	@Override
	public void cancelar(Inquilino inquilino, Propietario propietario) {
		inquilino.pagar(dineroAPagar, propietario);
	}
}
