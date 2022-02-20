package es.iestetuan.asc.dao.procesar;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JacksonXmlRootElement(localName = "linea_redmetro")
public class LineaJSON implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3454578198490558141L;

	@JsonProperty("codigo_linea_json")
	@JacksonXmlProperty(localName = "codigo_linea_xml",isAttribute = true)
	private int codigoLinea;
	
	@JsonProperty("nombre_corto_json")
	@JacksonXmlProperty(localName = "nombre_corto_xml")
	private String nombreCorto;
	
	@JsonProperty("nombre_largo_json")
	@JacksonXmlProperty(localName = "nombre_largo_xml")
	private String nombreLargo;
	
	@JsonProperty("color_linea")
	@JacksonXmlProperty(localName = "color_linea")
	private ColorJSON color;
	
	@JsonProperty("kilometros_json")
	@JacksonXmlProperty(localName = "kilometros_xml")
	private float kilometros;
	
	@JsonProperty("url_imagen_linea_json")
	@JacksonXmlProperty(localName = "url_imagen_linea_xml")
	private String url;

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
