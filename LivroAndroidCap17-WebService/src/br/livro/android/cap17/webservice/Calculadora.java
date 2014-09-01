package br.livro.android.cap17.webservice;

import java.io.IOException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import android.util.Log;

/**
 * Calculadora que acessa o WebService:
 * 
 * http://localhost/xfire/services/CalculadoraService?wsdl
 * 
 * no Android substituir o localhost por 10.0.2.2
 * 
 * http://localhost:8080/livro_android_xfire/services/Calculadora?wsdl
 * 
 * <v:Envelope xmlns:i="http://www.w3.org/2001/XMLSchema-instance" xmlns:d="http://www.w3.org/2001/XMLSchema" xmlns:c="http://schemas.xmlsoap.org/soap/encoding/" 
xmlns:v="http://schemas.xmlsoap.org/soap/envelope/">
<v:Header />
<v:Body>
<n0:soma id="o0" c:root="1" xmlns:n0="http://xfire.codehaus.org/Calculadora">
<n1 i:type="d:int">4</n1>
<n2 i:type="d:int">5</n2>
</n0:soma>
</v:Body>
</v:Envelope>
 * 
 * @author ricardo
 *
 */
public class Calculadora {
	private static final String TAG = "ID";
	private final String url;
	public Calculadora(String url) {
		this.url = url;
	}
	public String somar(int n1, int n2) throws IOException, XmlPullParserException {
		// Namespace e nome para o objeto SOAP
		String namespace = "http://xfire.codehaus.org/Calculadora";
		String name = "soma";
		String method = "Calculadora";
		SoapObject soap = new SoapObject(namespace, name);

		// Adiciona os parâmetros para a soma
		soap.addProperty("n1", n1);
		soap.addProperty("n2", n2);

		// Cria o envelope com o objeto SOAP
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);

		Log.i(TAG, "Chamando WebService: " + url);

		// Cria o HttpTransport para enviar os dados (SOAP)
		HttpTransportSE httpTransport = new LivroHttpTransport(url);
		// Faz a requisição
		httpTransport.call(method, envelope);

		// Recupera o resultado
		Object soma = envelope.getResponse();

		Log.i(TAG,"Soma: " + soma);

		return soma.toString();
	}
}
