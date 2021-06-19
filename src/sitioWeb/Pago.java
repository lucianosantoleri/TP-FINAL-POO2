package sitioWeb;

public enum Pago {

	DOSDIASRESERVA, GRATIS, CINCUENTAPORCIENTORESERVA, TOTALIDAD;
	
	Pago() {
		
	}
	
	private void pagarCancelacionGratuita(Usuario usuario) {
		usuario.setPago(DOSDIASRESERVA);
	}
	
	private void pagoNada(Usuario usuario) {
		usuario.setPago(GRATIS);
	}
	
	private void pagoTotal(Usuario usuario) {
		usuario.setPago(TOTALIDAD);
	}
	
	private void pagoCincuentaPorCiento(Usuario usuario) {
		usuario.setPago(CINCUENTAPORCIENTORESERVA);
	}
}
