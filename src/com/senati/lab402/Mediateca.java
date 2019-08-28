package com.senati.lab402;

public class Mediateca {
	public int id;
	public String titulo;
	public float precio;
	
	public Mediateca(int id, String titulo, float precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
	}

	public Mediateca() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Mediateca [id=" + id + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	
	
}
