package br.livro.android.cap17.socket.server.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import br.livro.android.cap17.socket.server.CalculadoraSocketThread;

/**
 * Função main para executar o ServerSocket
 * 
 * @author ricardo
 *
 */
public class CalculadoraSocket {

	private static final int PORTA = 7777;

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(PORTA);
		System.out.println("Socket aberto na porta 7777");

		while(true){
			System.out.println("esperando ...");
			Socket socket = serverSocket.accept();
			System.out.println("conectou!");
			new CalculadoraSocketThread(socket).start();
		}
	}
}
