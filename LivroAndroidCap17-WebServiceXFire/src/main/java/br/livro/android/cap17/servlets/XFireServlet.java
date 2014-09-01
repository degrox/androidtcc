package br.livro.android.cap17.servlets;

import javax.servlet.ServletException;

/**
 * Apenas para logar a inicialização
 * 
 * @author ricardo
 *
 */
public class XFireServlet extends org.codehaus.xfire.transport.http.XFireConfigurableServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.codehaus.xfire.transport.http.XFireServlet#init()
	 */
	public void init() throws ServletException {
		System.out.println(">> Iniciando XFireServlet...");

		super.init();
		
		System.out.println(">> XFireServlet iniciado com sucesso.");
	}
}
