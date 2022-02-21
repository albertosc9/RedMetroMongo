package es.iestetuan.asc.vo.mongo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JacksonXmlRootElement(localName = "color_linea")
public class ColorJSON implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7156687062942520453L;

	@JsonProperty("codigo_color_json")
	@JacksonXmlProperty(localName = "cod_color_xml", isAttribute = true)
	private int codigoColor;
	
	@JsonProperty("nombre_json")
	@JacksonXmlProperty(localName = "nombre_xml")
	private String nombre;
	
	@JsonProperty("codigo_hexadecimal_json")
	@JacksonXmlProperty(localName = "cod_hexadecimal_xml")
	private String codigoHexadecimal;

	public int getCodigoColor() {
		return codigoColor;
	}

	public void setCodigoColor(int codigoColor) {
		this.codigoColor = codigoColor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoHexadecimal() {
		return codigoHexadecimal;
	}

	public void setCodigoHexadecimal(String codigoHexadecimal) {
		this.codigoHexadecimal = codigoHexadecimal;
	}
	
}
