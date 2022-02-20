package es.iestetuan.asc.dao.mongo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import es.iestetuan.asc.dao.IMongo;
import es.iestetuan.asc.dao.procesar.ColorJSON;
import es.iestetuan.asc.dao.procesar.LineaJSON;


public class LineaColorMongo implements IMongo{

	

	
	public void crear(LineaJSON linea) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		String nombreBaseDatos="LineaDB";
		MongoDatabase baseDatosMongDB= mongoClient.getDatabase(nombreBaseDatos);
		
		String nombreColeccion="LineaColeccion";
		MongoCollection<Document> coleccionEmpleado = baseDatosMongDB.getCollection(nombreColeccion);
		
		Document documentolinea =new Document("_id", linea.getCodigoLinea())
				.append("nombre_corto", linea.getNombreCorto())
				.append("nombre_largo", linea.getNombreLargo())
				.append("Kilometros",linea.getKilometros())
				.append("URL",linea.getUrl());
		
		Document documentocolor = new Document("_id", linea.getColor().getCodigoColor())
				.append("Nombre", linea.getColor().getNombre())
				.append("CodHexa", linea.getColor().getCodigoHexadecimal());
		
		documentolinea.append("Color", documentocolor);
		
		coleccionEmpleado.insertOne(documentolinea);
	}
	public void actualizar(LineaJSON linea) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		String nombreBaseDatos="LineaDB";
		MongoDatabase baseDatosMongDB= mongoClient.getDatabase(nombreBaseDatos);
		
		String nombreColeccion="LineaColeccion";
		MongoCollection<Document> coleccionEmpleado = baseDatosMongDB.getCollection(nombreColeccion);
		
		BasicDBObject basicDBObject = new BasicDBObject("_id", linea.getCodigoLinea());
		Document documentolinea =new Document("nombre_corto", linea.getNombreCorto())
				.append("nombre_largo", linea.getNombreLargo())
				.append("Kilometros",linea.getKilometros())
				.append("URL",linea.getUrl());
		
		BasicDBObject objetoactualizar = new BasicDBObject();
		objetoactualizar.put("$set", documentolinea);
		
		coleccionEmpleado.updateOne(basicDBObject, objetoactualizar);
	}
	public void borrar(int idlinea) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		String nombreBaseDatos="LineaDB";
		MongoDatabase baseDatosMongDB= mongoClient.getDatabase(nombreBaseDatos);
		
		String nombreColeccion="LineaColeccion";
		MongoCollection<Document> coleccionEmpleado = baseDatosMongDB.getCollection(nombreColeccion);
		
		BasicDBObject filtroborrado = new BasicDBObject("_id", idlinea);
		coleccionEmpleado.findOneAndDelete(filtroborrado);
	
	}
	public LineaJSON consultar(int idlinea) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		String nombreBaseDatos="LineaDB";
		MongoDatabase baseDatosMongDB= mongoClient.getDatabase(nombreBaseDatos);
		
		String nombreColeccion="LineaColeccion";
		MongoCollection<Document> coleccionEmpleado = baseDatosMongDB.getCollection(nombreColeccion);
		
		BasicDBObject filtroConsulta = new BasicDBObject("_id",idlinea);
        Document documentoConsulta = coleccionEmpleado.find(filtroConsulta).first();
        Document documento = (Document) documentoConsulta.get("Color");
       


        LineaJSON linea = new LineaJSON();

        linea.setCodigoLinea(documentoConsulta.getInteger("_id"));
        linea.setNombreCorto(documentoConsulta.getString("nombre_corto"));
        linea.setNombreLargo(documentoConsulta.getString("nombre_largo"));
        linea.setUrl(documentoConsulta.getString("URL"));
        linea.setKilometros(documentoConsulta.getDouble("Kilometros").floatValue());
        linea.setColor(new ColorJSON(documento.getInteger("_id"),documento.getString("Nombre"),documento.getString("CodHexa")));
        
        
        return linea;
		
		
	}
	public List<LineaJSON> consultarTodo() {
		// TODO Auto-generated method stub
		
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		String nombreBaseDatos="LineaDB";
		MongoDatabase baseDatosMongDB= mongoClient.getDatabase(nombreBaseDatos);
		
		String nombreColeccion="LineaColeccion";
		MongoCollection<Document> coleccionEmpleado = baseDatosMongDB.getCollection(nombreColeccion);
		
		List<LineaJSON> lineas= new ArrayList<LineaJSON>();
		
		Iterator<Document> iteratorDocumentos = coleccionEmpleado.find().iterator();

        while(iteratorDocumentos.hasNext()) {
            Document docu = iteratorDocumentos.next();
            Document documento = (Document) docu.get("Color");
            LineaJSON linea = new LineaJSON();
            linea.setCodigoLinea(docu.getInteger("_id"));
            linea.setNombreCorto(docu.getString("nombre_corto"));
            linea.setNombreLargo(docu.getString("nombre_largo"));
            linea.setUrl(docu.getString("URL"));
            linea.setKilometros(docu.getDouble("Kilometros").floatValue());
            linea.setColor(new ColorJSON(documento.getInteger("_id"),documento.getString("Nombre"),documento.getString("CodHexa")));
            
            lineas.add(linea);
        }
		return lineas;
		
	}
	
	
}
