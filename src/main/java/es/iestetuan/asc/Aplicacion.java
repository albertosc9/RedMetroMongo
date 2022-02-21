package es.iestetuan.asc;

import java.net.URL;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import es.iestetuan.asc.dao.mongo.LineaColorMongo;
import es.iestetuan.asc.dao.utilities.URLlinea;
import es.iestetuan.asc.vo.mongo.ColorJSON;
import es.iestetuan.asc.vo.mongo.LineaJSON;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		URLlinea prueba= new URLlinea();
		
		LineaJSON[] lineas = prueba.cogerLineas();
		LineaColorMongo metodos = new LineaColorMongo();
		
		LineaJSON lineas1= prueba.cogerLineaXML();
			
		
		
		/*crear
		for(LineaJSON i : lineas) {
			
			metodos.crear(i);
			
		}*/
		
		//borrar
//		metodos.borrar(5);
		
		//actualizar
//		LineaJSON lineaconsulta = metodos.consultar(3);
//		lineaconsulta.setNombreCorto(lineas1.getNombreCorto());
//		lineaconsulta.setKilometros(lineas1.getKilometros());
//		metodos.actualizar(lineaconsulta);
		
//		buscar
		LineaJSON linea = metodos.consultar(8);
		System.out.println(linea);
		
		//lista
//		List<LineaJSON> lista= metodos.consultarTodo();
//		for(LineaJSON i : lista) {
//			System.out.println(i);
//		}
	}

}
