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
}
