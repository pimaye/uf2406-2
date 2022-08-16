package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class FuncionesTest {
	
	
public static Funciones f;
	
	@BeforeAll
	static void inicializarFunciones() {
		f = new Funciones();
		
	}
	

	@Test
	void devuelveCentralTest() {
					
		assertEquals(5,f.devuelveCentral(1, 5, 9),"Error en devolver el número central");
		assertEquals(5,f.devuelveCentral(5, 9, 1), "Error en devolver el número central");
			
	}
	
		
	@Test
	void esBisiestoTest() {
		
		assertTrue(f.esBisiesto(2020));
		assertFalse(f.esBisiesto(2022));
	}

	

}
