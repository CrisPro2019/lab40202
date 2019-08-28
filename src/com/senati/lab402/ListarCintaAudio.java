package com.senati.lab402;


import java.util.HashSet;
import java.util.Set;

import com.senati.lab402.CintaAudio;

public class ListarCintaAudio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CintaAudio ca1 = new CintaAudio(1, "We make up", 10f, "Blacc", "EE.UU", "Miami");
		CintaAudio ca2 = new CintaAudio(2, "Inolvidable", 10f, "Reik", "Mexico", "Pachuca");
		CintaAudio ca3 = new CintaAudio(3, "Tu no te imaginas", 10f, "Gian Marco", "Perú", "Lima");
		
		Set <CintaAudio> audioMediateca = new HashSet<CintaAudio>();
		
		audioMediateca.add(ca1);
		audioMediateca.add(ca2);
		audioMediateca.add(ca3);
		
		for (CintaAudio audio : audioMediateca) {
			System.out.println(audio.getId() + " " + audio.getTitulo() + " " + audio.getAutor() + " " + audio.getLugar() + " " + audio.getDireccion());;
		}
	}

}
