package es.iestetuan.asc.dao.vo;

public class Color {

	private int codigoColor;
	private String nombreColor;
	private String codigoHexadecimal;
	
	
	
	
	public Color(int codigoColor, String nombreColor, String codigoHexadecimal) {
		super();
		this.codigoColor = codigoColor;
		this.nombreColor = nombreColor;
		this.codigoHexadecimal = codigoHexadecimal;
	}
	public String getNombreColor() {
		return nombreColor;
	}
	public void setNombreColor(String nombreColor) {
		this.nombreColor = nombreColor;
	}
	public int getCodigoColor() {
		return codigoColor;
	}
	public void setCodigoColor(int codigoColor) {
		this.codigoColor = codigoColor;
	}
	
	public String getCodigoHexadecimal() {
		return codigoHexadecimal;
	}
	public void setCodigoHexadecimal(String codigoHexadecimal) {
		this.codigoHexadecimal = codigoHexadecimal;
	}
	
	public Color() {
	}
	@Override
	public String toString() {
		return "Color [codigoColor=" + codigoColor + ", nombreColor=" + nombreColor + ", codigoHexadecimal="
				+ codigoHexadecimal + "]";
	}
	
	
	
}
