package sitioWeb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SitioWeb implements ISitioWeb{
    private List<Usuario> usuarios;
    private List<Inmueble> inmueblesOfertados;
    private List<Inmueble> altasDelSitio;
    private IBuscador buscador;
    
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
	
	public List<Inmueble> buscar(String ciudad, LocalDate entrada, LocalDate salida, int capacidad, int precioMin, int precioMax) {
    	return buscador.buscar(ciudad, entrada, salida, capacidad, precioMin, precioMax, this.getInmueblesOfertados());
    }
	
	List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Inmueble> getInmueblesOfertados() {
		return this.inmueblesOfertados;
	}

	List<Inmueble> getInmueblesADarDeAlta() {
		return altasDelSitio;
	}
	
    
}
