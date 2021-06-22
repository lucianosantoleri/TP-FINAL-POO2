package sitioWeb;

import java.time.LocalDate;
import java.util.List;

public interface ISitioWeb {
	List<Inmueble> buscar(String ciudad, LocalDate entrada, LocalDate salida, int capacidad, int precioMin, int precioMax);
    void visualizar(Inmueble inmueble);
}
