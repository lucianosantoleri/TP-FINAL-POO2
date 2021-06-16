package sitioWeb;

import java.util.ArrayList;
import java.util.List;

public class SitioWeb {
    private List<Usuario> usuarios;
    private List<Inmueble> inmueblesOfertados;
    private List<Inmueble> altasDelSitio;
    
    public SitioWeb() {
    	usuarios = new ArrayList<>();
    	inmueblesOfertados = new ArrayList<>();
    	altasDelSitio = new ArrayList<>();
    }
    
    void darDeAlta(Inmueble inmueble) {
    	// TODO faltarian las notificaciones al propietario de q su inmueble fue dado de alta
    	this.removeAltasDelSitio(inmueble);
    	this.addInmueblesOfertados(inmueble);
    }
    
    void registrarUsuario(Usuario usuario) {
    	this.usuarios.add(usuario);
    }

	void removeAltasDelSitio(Inmueble inmueble) {
		this.altasDelSitio.remove(inmueble);
	}

	void addInmueblesOfertados(Inmueble inmueble) {
		this.inmueblesOfertados.add(inmueble);
	}

	List<Usuario> getUsuarios() {
		return usuarios;
	}

	List<Inmueble> getInmueblesOfertados() {
		return inmueblesOfertados;
	}

	List<Inmueble> getInmueblesADarDeAlta() {
		return altasDelSitio;
	}
    
}
