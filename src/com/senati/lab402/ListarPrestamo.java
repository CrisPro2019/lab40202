package com.senati.lab402;

import java.util.HashSet;
import java.util.Set;

import com.senati.lab402.Prestamo;

public class ListarPrestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prestamo pr1 = new Prestamo(1, 2, 4, 15, 5000);
		Prestamo pr2 = new Prestamo(2, 5, 4, 35, 3000);
		Prestamo pr3 = new Prestamo(3, 8, 4, 25, 2800);
		
		Set <Prestamo> libroMediateca = new HashSet<Prestamo>();
		
		libroMediateca.add(pr1);
		libroMediateca.add(pr2);
		libroMediateca.add(pr3);
		
		for (Prestamo prestamo : libroMediateca) {
			System.out.println(prestamo.getIdSocio() + " " + prestamo.getIdTitulo() + " " + prestamo.getIdPrestamo() + " " + prestamo.getMonto() + " " + prestamo.getNrodias());
		}
	}

}
