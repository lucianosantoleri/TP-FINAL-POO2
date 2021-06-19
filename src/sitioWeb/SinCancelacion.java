package sitioWeb;

public class SinCancelacion implements PoliticaDeCancelacion {

	@Override
	public void cancelar(Usuario usuario) {
		usuario.setPago(Pago.TOTALIDAD);
	}
}
