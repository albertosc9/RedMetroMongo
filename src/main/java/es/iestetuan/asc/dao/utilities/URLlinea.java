package es.iestetuan.asc.dao.utilities;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import es.iestetuan.asc.vo.mongo.LineaJSON;

public class URLlinea {

	public LineaJSON[] cogerLineas() {
		
		LineaJSON[] listadelineas=null;
		ObjectMapper omapper = new JsonMapper();
		HttpClient httpclient = HttpClient.newHttpClient();
		URI uri = URI.create(GestorConfiguracion.getInfoConfiguracion("lineasURL"));
		HttpRequest httprequest = HttpRequest.newBuilder().uri(uri).GET().build();
		
		try {
			HttpResponse<String> httpresponse = httpclient.send(httprequest, BodyHandlers.ofString());
			String resultado = httpresponse.body();
			listadelineas = omapper.readValue(resultado, LineaJSON[].class);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listadelineas;
		}
	
public LineaJSON cogerLineaXML() {
		
		LineaJSON listadelineas=null;
		ObjectMapper omapper = new XmlMapper();
		HttpClient httpclient = HttpClient.newHttpClient();
		URI uri = URI.create(GestorConfiguracion.getInfoConfiguracion("lineaURL"));
		HttpRequest httprequest = HttpRequest.newBuilder().uri(uri).GET().build();
		
		try {
			HttpResponse<String> httpresponse = httpclient.send(httprequest, BodyHandlers.ofString());
			String resultado = httpresponse.body();
			listadelineas = omapper.readValue(resultado, LineaJSON.class);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listadelineas;
		}
}
