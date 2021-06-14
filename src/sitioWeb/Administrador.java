package sitioWeb;

public class Administrador {

	private SitioWeb sitio;
	
	public Administrador(SitioWeb suSitio) {
		setSitio(suSitio);
	}

	public SitioWeb getSitio() {
		return sitio;
	}

	public void setSitio(SitioWeb sitio) {
		this.sitio = sitio;
	}
	
	// no especifica q el administrador de de alta pero por ahora lo dejo acá
	// puede q vaya en SitioWeb.
	enum FormaDePago {
		EFECTIVO, CREDITO, DEBITO;
	}
	
	// alta de administrador
	enum TipoDeInmueble {
		HABITACION, DEPARTAMENTO, CASA, QUINCHO;
	}
	
	enum Servicio {
		AGUA, GAS, ELECTRICIDAD, BANIOPRIVADO, BANIOCOMPARTIDO, CALEFACCION, AIREACONDICIONADO, WIFI;
	}
}
