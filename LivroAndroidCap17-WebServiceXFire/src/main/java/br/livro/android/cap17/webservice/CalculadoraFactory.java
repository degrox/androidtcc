package br.livro.android.cap17.webservice;

import java.net.MalformedURLException;

import org.codehaus.xfire.XFire;
import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;


/**
 * Factory para o Web Service da Calculadora
 * 
 * @author ricardo
 *
 */
public class CalculadoraFactory {

	private static final String URL = "http://localhost:8080/livro_android_xfire/services/Calculadora";

	public static Calculadora getService() throws MalformedURLException {
		Service serviceModel = new ObjectServiceFactory().create(Calculadora.class);

		// determina qual o tipo de objeto que vamos querer criar
		XFire xfire = XFireFactory.newInstance().getXFire();
		XFireProxyFactory factory = new XFireProxyFactory(xfire);

		// proxy para nosso serviço

		// URL para acessar o web service
		Calculadora service = (Calculadora)  factory.create(serviceModel,URL);
		
		return service;
	}

}
