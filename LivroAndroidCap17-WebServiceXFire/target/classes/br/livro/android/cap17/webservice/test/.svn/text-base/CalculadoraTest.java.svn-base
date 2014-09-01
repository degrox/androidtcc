package br.livro.android.cap17.webservice.test;

import java.net.MalformedURLException;

import junit.framework.TestCase;
import br.livro.android.cap17.webservice.Calculadora;
import br.livro.android.cap17.webservice.CalculadoraFactory;

/**
 * TestCase para validar a super calculadora em XFire
 * 
 * @author ricardo
 *
 */
public class CalculadoraTest extends TestCase
{
    public void testSoma() throws MalformedURLException {
    	Calculadora calc = CalculadoraFactory.getService();
		assertNotNull(calc);
		assertEquals(7,calc.soma(3,4));
		assertEquals(8,calc.soma(3,5));
		assertEquals(9,calc.soma(3,6));
		System.out.println("Soma OK");
    }
    public void testMult() throws MalformedURLException {
		
    	Calculadora calc = CalculadoraFactory.getService();

		assertNotNull(calc);
		
		assertEquals(12,calc.mult(3,4));
		assertEquals(15,calc.mult(3,5));
		assertEquals(18,calc.mult(3,6));
		
		System.out.println("Mult OK");
    }
	public void testHello() throws MalformedURLException {
    	Calculadora calc = CalculadoraFactory.getService();
		assertNotNull(calc);
		assertEquals("Hello XFire",calc.hello());
		System.out.println("Hello OK");
    }
    
}
