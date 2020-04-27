package sumador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestASumar {
	/**
	 * Prueba para una cifra
	 *
	 */
	 @Test
	    public void testUnaCifra() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.mostrar("7");
	        assertEquals("7 = 7",resultado );
	  }

	 /**
	  * Prueba para cifra negativa
	  *
	  */	 
	 @Test
	    public void testNegativo() {
	    	ASumar sumi= new ASumar();
	    	String resultado = sumi.mostrar("-7");
	    	assertNull(resultado);
	    }
}
