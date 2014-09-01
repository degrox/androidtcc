package br.livro.android.cap17.servlets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.livro.android.cap17.socket.server.Calculadora;


/**
 * @author ricardo
 *
 */
public class CalculadoraStreamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		PrintWriter writer = response.getWriter();
		writer.print("Servlet OK, mas utilize POST pelo celular");
		writer.flush();
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");

		DataOutputStream out = new DataOutputStream(response.getOutputStream());
		DataInputStream in = new DataInputStream(request.getInputStream());

		Calculadora calc = new Calculadora(in);

		int soma = calc.somar();

		System.out.println("soma: " + soma);

		calc.enviar(out);

		in.close();

		out.flush();
		out.close();
	}
}
