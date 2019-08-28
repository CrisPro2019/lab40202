package com.senati.lab402;

public class CintaAudio extends Mediateca {
	String autor;
	String lugar;
	String direccion;
	
	public CintaAudio() {
		super();
	}
	
	
	
	public CintaAudio(int id, String titulo, float precio, String autor, String lugar, String direccion) {
		super(id, titulo, precio);
		this.autor = autor;
		this.lugar = lugar;
		this.direccion = direccion;
	}



	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "CintaAudio [autor=" + autor + ", lugar=" + lugar + ", direccion=" + direccion + ", id=" + id
				+ ", titulo=" + titulo + ", precio=" + precio + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CintaAudio other = (CintaAudio) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (lugar == null) {
			if (other.lugar != null)
				return false;
		} else if (!lugar.equals(other.lugar))
			return false;
		return true;
	}
	
	
	
}
