package com.senati.lab402;

import java.util.HashSet;
import java.util.Set;
import com.senati.lab402.Socio;

public class Listarsocios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio so1 = new Socio(1, "Jorge", "Luque Chambi", "Independencia");
		Socio so2 = new Socio(2, "Monica", "Salas Chanduvi", "Carabayllo");
		Socio so3 = new Socio(3, "Brighit", "Huicho Pinto", "La Victoria");
		Socio so4 = new Socio(4, "Sthephany", "Paredes de Vidal", "Huacho");
		Socio so5 = new Socio(5, "Britany", "Valderrama Torrejon", "Payet");
		Socio so6 = new Socio(6, "Nelly", "Chihuan", "Puente Piedra");
		Socio so7 = new Socio(7, "Isidora", "Pardo Chiroque", "La Molina");
		Socio so8 = new Socio(8, "Tristona", "Dominguez Chambi", "Barrios Altos");
		Socio so9 = new Socio(9, "Pericles", "Amasifen", "Cercado");
		Socio so10 = new Socio(10, "Ronald", "Chambi", "Huancayo");
		
		Set <Socio> socioMediateca = new HashSet<Socio>();
		
		socioMediateca.add(so1);
		socioMediateca.add(so2);
		socioMediateca.add(so3);
		socioMediateca.add(so4);
		socioMediateca.add(so5);
		socioMediateca.add(so6);
		socioMediateca.add(so7);
		socioMediateca.add(so8);
		socioMediateca.add(so9);
		socioMediateca.add(so10);
		
		for (Socio socio : socioMediateca) {
			System.out.println(socio.getIdsocio() + " " + socio.getApellido() + " " + socio.getNombre());
		}
	}

}
