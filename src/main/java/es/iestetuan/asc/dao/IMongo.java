package es.iestetuan.asc.dao;

import java.util.List;

import es.iestetuan.asc.dao.vo.Linea;
import es.iestetuan.asc.vo.mongo.LineaJSON;

public interface IMongo {

	public void crear(LineaJSON linea);
	public void actualizar(LineaJSON linea);
	public void borrar(int idlinea);
	public LineaJSON consultar(int idlinea);
	public List<LineaJSON> consultarTodo();
	
	
	
}
