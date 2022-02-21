package es.iestetuan.asc.dao.vo;

import es.iestetuan.asc.vo.mongo.ColorJSON;

public class Linea {

	private int codigoLinea;
	private String nombreCorto;
	private String nombreLargo;
	private ColorJSON color;
	private float kilometros;
	private String url;
	
	public Linea() {
		
	}
	public Linea(int codigoLinea, String nombreCorto, String nombreLargo, ColorJSON color, float kilometros,
			String url) {
		this.codigoLinea = codigoLinea;
		this.nombreCorto = nombreCorto;
		this.nombreLargo = nombreLargo;
		this.color = color;
		this.kilometros = kilometros;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Linea [codigoLinea=" + codigoLinea + ", nombreCorto=" + nombreCorto + ", nombreLargo=" + nombreLargo
				+ ", color=" + color + ", kilometros=" + kilometros + ", url=" + url + "]";
	}
	public int getCodigoLinea() {
		return codigoLinea;
	}
	public void setCodigoLinea(int codigoLinea) {
		this.codigoLinea = codigoLinea;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public String getNombreLargo() {
		return nombreLargo;
	}
	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}
	public ColorJSON getColor() {
		return color;
	}
	public void setColor(ColorJSON color) {
		this.color = color;
	}
	public float getKilometros() {
		return kilometros;
	}
	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
