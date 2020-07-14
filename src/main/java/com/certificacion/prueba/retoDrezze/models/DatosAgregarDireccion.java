package com.certificacion.prueba.retoDrezze.models;

public class DatosAgregarDireccion {
	
	private String direccion1;
	private String direccion2;
	private String cuidad;
	private String estado;
	private String codigoPostal;
	private String pais;
	private String numeroCasa;
	private String numeroCelular;
	private String informacionAdicional;
	private String tituloDireccion;

	public DatosAgregarDireccion(String direccion1, String direccion2, String cuidad, String estado, String codigoPostal, String pais, String numeroCasa, String numeroCelular, String informacionAdicional, String tituloDireccion) {
		this.direccion1 = direccion1;
		this.direccion2 = direccion2;
		this.cuidad = cuidad;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
		this.numeroCasa = numeroCasa;
		this.numeroCelular = numeroCelular;
		this.informacionAdicional = informacionAdicional;
		this.tituloDireccion = tituloDireccion;
	}

	public String getDireccion1() {
		return direccion1;
	}

	public String getDireccion2() {
		return direccion2;
	}

	public String getCuidad() {
		return cuidad;
	}

	public String getEstado() {
		return estado;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public String getPais() {
		return pais;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public String getInformacionAdicional() {
		return informacionAdicional;
	}

	public String getTituloDireccion() {
		return tituloDireccion;
	}
}
