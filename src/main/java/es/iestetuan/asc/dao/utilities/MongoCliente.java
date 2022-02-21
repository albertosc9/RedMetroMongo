package es.iestetuan.asc.dao.utilities;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class MongoCliente {

	private MongoClient mongoClient = null;
	
	

	public MongoCollection<Document> getDocumento() {
		

		MongoClient mongoClient = new MongoClient(new MongoClientURI(GestorConfiguracion.getInfoConfiguracion("cliente")));
		
		String nombreBaseDatos=GestorConfiguracion.getInfoConfiguracion("BBDD");
		MongoDatabase baseDatosMongDB= mongoClient.getDatabase(nombreBaseDatos);
		
		String nombreColeccion=GestorConfiguracion.getInfoConfiguracion("coleccion");
		MongoCollection<Document> coleccionEmpleado = baseDatosMongDB.getCollection(nombreColeccion);
	
		
		return  coleccionEmpleado;
		
	}
}