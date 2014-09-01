package br.livro.android.cap17.domain;

import java.io.DataOutputStream;
import java.io.IOException;

public class Carro {
	private Long id;
	private String nome;
	private byte[] imagem;
	public Carro(Long id, String nome, byte[] imagem) {
		super();
		this.id = id;
		this.imagem = imagem;
		this.nome = nome;
	}
	public void serialize(DataOutputStream out) throws IOException{
		out.writeLong(id);
		out.writeUTF(nome);
		// Escreve o tamanho e a imagem
		out.writeInt(imagem.length);
		out.write(imagem);
	}
}
