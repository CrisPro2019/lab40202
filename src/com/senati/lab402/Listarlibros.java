package com.senati.lab402;

import java.util.HashSet;
import java.util.Set;

import com.senati.lab402.Libros;

public class Listarlibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros lb1 = new Libros(1 , "Sangre de Campeon", 5f, "", 500, 1450);
		Libros lb2 = new Libros(2 , "El caballero Carmelo", 10f, "", 248, 1200);
		Libros lb3 = new Libros(3 , "El gallinazo sin plumas", 8f, "", 126, 1150);
		
		Set <Libros> libroMediateca = new HashSet<Libros>();
		
		libroMediateca.add(lb1);
		libroMediateca.add(lb2);
		libroMediateca.add(lb3);
		
		for (Libros libro : libroMediateca) {
			System.out.println(libro.getId() + " " + libro.getTitulo() + " " + libro.getAutor() + " " + libro.getNropag() + " " + libro.getNroisbn());;
		}
	}

}
