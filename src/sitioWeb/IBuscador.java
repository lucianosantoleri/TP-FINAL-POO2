package sitioWeb;

import java.time.LocalDate;
import java.util.List;

public interface IBuscador {
    List<Inmueble> buscar(String ciudad, LocalDate entrada, LocalDate salida, int capacidad, int precioMin, int precioMax, List<Inmueble> inmuebles);
}
