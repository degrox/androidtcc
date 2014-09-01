package br.livro.android.cap17.socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Trata a requisição do Socket em outra Thread
 * 
 * @author ricardo
 *
 */
public class CalculadoraSocketThread extends Thread {
	private final Socket socket;
	public CalculadoraSocketThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			DataOutputStream out 	= new DataOutputStream(socket.getOutputStream());
			DataInputStream in 		= new DataInputStream(socket.getInputStream());

			Calculadora calc = new Calculadora(in);
			calc.somar();
			calc.enviar(out);

			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
