package br.livro.android.cap17.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que recebe os parâmetros n1 e n2 para fazer a soma
 * 
 * Escreve o texto da soma na response
 * 
 * @author ricardo
 *
 */
public class CalculadoraServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doGet simplesmente chama o doPost
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//isto é um exemplo, não estamos tratando erros aqui
		Integer n1 = Integer.parseInt(request.getParameter("n1"));
		Integer n2 = Integer.parseInt(request.getParameter("n2"));

		int soma = n1 + n2;

		System.out.println("Soma do servidor("+n1+"+"+n2+"): " + soma);

		write(response, soma);
	}
	private void write(HttpServletResponse response,int soma) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();		
		writer.print("Soma: " + soma);
		writer.flush();
		writer.close();
	}
}
