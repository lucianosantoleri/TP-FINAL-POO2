package sitioWeb;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RankingTestCase {
    Ranking ranking;
    
	@BeforeEach
	void setUp() throws Exception {
		ranking = new Ranking();
		
		ranking.puntuar(4);
		ranking.puntuar(4);
		ranking.puntuar(2);
		ranking.puntuar(3);
	}

	@Test
	void testTotalPuntaje() {
		// testea puntajeTotal q es la suma de todas las calificaciones
		assertEquals(ranking.puntajeTotal(), 13, 0f);
	}
	
	@Test
	void testActualizarPromedio() {
		// testea actualizarPromedio q es el promedio de todas las calificaciones
		assertEquals(ranking.actualizarPromedio(), 3.25f, 0.0f );
	}
	
	@Test 
	void testActualizarAlAgregarUnPuntaje() {
		// testea q tras ejecutarse puntuar el puntajePromedio se actualize correctamente 
		ranking.puntuar(5);
		assertEquals(ranking.actualizarPromedio(), 3.6f, 0.0f);
	}
	

}
