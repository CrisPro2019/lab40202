package com.senati.lab402;

import java.util.HashSet;
import java.util.Set;

import com.senati.lab402.CintaVideo;

public class ListarCintaVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CintaVideo cv1 = new CintaVideo(1, "Spiderman Far From Home", 25f, "Jon Watts", "Tom Holland", "Jake Gyllenhaal", 140);
		CintaVideo cv2 = new CintaVideo(2, "Spiderman Homecoming", 23f, "Jon Watts", "Tom Holland", "Adrian Toomes", 130);
		CintaVideo cv3 = new CintaVideo(3, "Avengers Endgame", 55f, "Jon Watts", "Robert Downey Jr", "Chris Evans", 180);
		
		Set <CintaVideo> cintaMediateca = new HashSet<CintaVideo>();
		
		cintaMediateca.add(cv1);
		cintaMediateca.add(cv2);
		cintaMediateca.add(cv3);
		
		for (CintaVideo cinta : cintaMediateca) {
			System.out.println(cinta.getId() + " " + cinta.getTitulo() + " " + cinta.getActorprincipal() + " " + cinta.getActorsecundario() + " " + cinta.getDuracion() + " " + cinta.getPrecio());;
		}
	}

}
