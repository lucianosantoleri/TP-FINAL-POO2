package sitioWeb;

class Visualizador implements Visualizable{
	
	public static void visualizarInfo(String[] args) {
		
	}

	public void visualizar(Inmueble inmueble) {
		informacionDelImnueble(inmueble);
		informacionDelPropietario(inmueble, inmueble.getPropietario());
	}

	void informacionDelImnueble(Inmueble inmueble) {
		System.out.println("Pais :" + inmueble.getPais());
		System.out.println("Ciudad: " + inmueble.getCiudad());
		System.out.println("Tipo Inmueble: " + inmueble.getTipo().toString());
		System.out.println("Superficie: "  + inmueble.getSuperficie());
		System.out.println("Capacidad: "   + inmueble.getCapacidad());
		System.out.println("Direccion: " + inmueble.getDireccion());
		System.out.println("Servicios: "  + inmueble.getSuperficie());
		System.out.println("Superficie: "  + inmueble.getSuperficie());
		System.out.println("Check In: " + inmueble.getCheckIn());
		System.out.println("Check Out: "  + inmueble.getCheckOut());
		System.out.println("Formas De Pago: "  + inmueble.getFormasDePago());
		System.out.println("Superficie: "  + inmueble.getSuperficie());
		System.out.println("Precio: " + inmueble.getPrecio());
		System.out.println("Calificaciones: " + inmueble.getRanking().getCalificaciones());
		System.out.println("Puntaje Promedio: " + inmueble.getRanking().getPuntajePromedio());
		System.out.println("Calificaciones: " + inmueble.getRanking().getCalificaciones());
		System.out.println("Comentarios: " + inmueble.getComentarios());
	}
	
	void informacionDelPropietario(Inmueble inmueble, Propietario propietario) {
		System.out.println("Nombre: " + propietario.getNombreCompleto());
		System.out.println("Email: " + propietario.geteMail());
		System.out.println("Telefono: " + propietario.getTelefono());
		System.out.println("Fecha De Creacion: " + propietario.getFechaDeIngreso());
		System.out.println("Calificaciones: " + propietario.getRanking().getCalificaciones());
		System.out.println("Puntaje Promedio: " + propietario.getRanking().getPuntajePromedio());
		System.out.println("Veces Alquilado El Inmueble: "  + propietario.vecesAlquilado(inmueble));
		System.out.println("Veces Alquilado: " + propietario.totalAlquileres());
	}
}
