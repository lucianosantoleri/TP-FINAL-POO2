package sitioWeb;

import java.util.ArrayList;
import java.util.List;

// debería haber una forma de q la calificación tenga un tope de valores, ej: del 1 al 5
// al igual q el promedio, por ej, que el valor más alto sea 5. ¿¿¿¿usando puntaje como enumerativo????

class Ranking {
    private List<Integer> calificaciones;
    private float puntajePromedio;
    
    public Ranking() {
    	this.calificaciones = new ArrayList<Integer>();
    	this.puntajePromedio = 0;
    }
    
    void puntuar(int puntaje) {
    	this.calificaciones.add(puntaje);
    	this.actualizarPromedio();
    }
    
	private float actualizarPromedio() {
		// el puntaje promedio sería el resultado de dividir la suma de todas las calificaciones
		// por la cantidad de las mismas.
		return this.puntajeTotal() / this.calificaciones.size() ;
	}

	List<Integer> getCalificaciones() {
		return calificaciones;
	}
	
	float getPuntajePromedio() {
		return puntajePromedio;
	}
	
	private long puntajeTotal() {
		// retorna la suma de todos los puntajes de la lista calificaciones.
	    return this.calificaciones.stream().count();
	}
    
}
