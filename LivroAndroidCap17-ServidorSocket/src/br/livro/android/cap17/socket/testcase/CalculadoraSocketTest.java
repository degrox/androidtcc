package br.livro.android.cap17.socket.testcase;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import junit.framework.TestCase;










/**
 * Cliente para testar o Socket da Calculadora
 * 
 * @author ricardo
 *
 */
public class CalculadoraSocketTest extends TestCase {
	private static final String IP = "localhost";
	private static final int PORTA = 7777;
	private Socket socket;
	private OutputStream out;
	private InputStream in;
	
	
	protected void setUp() throws Exception {
		socket = new Socket(IP,PORTA);

		out = socket.getOutputStream();
		in  = socket.getInputStream();
	}
	public void testSoma() throws IOException {
		DataOutputStream out 	= new DataOutputStream(socket.getOutputStream());
		DataInputStream in 		= new DataInputStream(socket.getInputStream());

		//Envia os n�meros
		out.writeInt(4);
		out.writeInt(5);

		//Envia
		out.flush();

		//L� a resposta
		int soma = in.readInt();

		System.out.println("Soma: " + soma);

		assertEquals(9, soma);
	}
	@Override
	protected void tearDown() throws Exception {
		out.close();
		in.close();
		socket.close();
	}
}
