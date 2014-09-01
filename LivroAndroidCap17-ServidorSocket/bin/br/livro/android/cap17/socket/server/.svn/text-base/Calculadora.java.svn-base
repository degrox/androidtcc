package br.livro.android.cap17.socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Simples Calculadora.
 * 
 * Recebe os números pelo construtor na DataInputStream
 * 
 * e envia a resposta com o método enviar(DataOutputStream)
 * 
 * @author ricardo
 *
 */
public class Calculadora {
	private int n1;
	private int n2;
	private int soma;
	public Calculadora(DataInputStream in) throws IOException {
		//Faz a leitura dos números
		n1 = in.readInt();
		n2 = in.readInt();
	}
	public int somar(){
		return soma = n1 + n2;
	}
	public void enviar(DataOutputStream out) throws IOException{
		//Envia a soma
		out.writeInt(soma);
	}
}
