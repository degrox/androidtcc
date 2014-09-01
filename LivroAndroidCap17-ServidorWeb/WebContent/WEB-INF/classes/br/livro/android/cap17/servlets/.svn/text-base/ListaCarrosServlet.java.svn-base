package br.livro.android.cap17.servlets;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.livro.android.cap17.domain.Carro;

/**
 * Servlet que retorna uma Lista de carros para o celular
 * 
 * Utiliza a DataOutputStream para serializar cada Carro
 * 
 * @author ricardo
 * 
 */
public class ListaCarrosServlet extends HttpServlet {
	private static final long serialVersionUID = -2384865376765364532L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// doGet simplesmente chama o doPost
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// apenas para acessar a pasta /peugeot
		List<Carro> carros = getCarros();

		ServletOutputStream out = response.getOutputStream();
		DataOutputStream dataOut = new DataOutputStream(out);

		// escreve a quantidade de carros
		dataOut.writeInt(carros.size());

		// serializa os carros
		for (Carro c : carros) {
			c.serialize(dataOut);
		}

		dataOut.flush();
		dataOut.close();
		out.close();
	}
	// cria uma lista de carros lendo a pasta 'pasta_peugeot' do servidor web
	private List<Carro> getCarros() throws IOException {
		String realPath = getServletContext().getRealPath("/");
		File imgDir = new File(realPath, "pasta_peugeot");

		List<Carro> carros = new ArrayList<Carro>();
		for (int i = 1; i <= 10; i++) {
			byte[] imagem = lerImagem(new File(imgDir, "peugeot" + i + ".jpg"));
			String nome = "Carro " + i;
			Carro c = new Carro(new Long(i), nome, imagem);
			carros.add(c);
		}
		return carros;
	}
	public static byte[] lerImagem(File file) throws IOException {
		//o jar commons-io-1.4.jar está no WEB-INF/lib
		byte[] bytes = org.apache.commons.io.FileUtils.readFileToByteArray(file);
		return bytes;
	}
}
