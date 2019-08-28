package com.senati.lab402;

public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros libro1 = new Libros();
		libro1.id = 100;
		libro1.titulo = "C#";
		libro1.autor = "Grupo Eidos";
		libro1.nropag = 500;
		libro1.nroisbn = 1450;
		libro1.precio = 50f;
		
		CintaVideo cintavideo1 = new CintaVideo();
		cintavideo1.director = "Jon Watts";
		cintavideo1.actorprincipal = "Tom Holland";
		cintavideo1.actorsecundario = "Jake Gyllenhaal";
		cintavideo1.duracion = 140;
		cintavideo1.id = 200;
		cintavideo1.titulo = "Spiderman Far From Home";
		cintavideo1.precio = 25;
		
		CintaAudio cintaaudio1 = new CintaAudio();
		cintaaudio1.id = 300;
		cintaaudio1.titulo = "We make up";
		cintaaudio1.autor = "Aloe Blacc";
		cintaaudio1.lugar = "Miami";
		cintaaudio1.direccion = "EE.UU";
		cintaaudio1.precio = 150;
		
		Socio socio1 = new Socio(401, "Cristian", "Bernal", "S.M.P");
		System.out.println(socio1.nombreCompleto());
		System.out.println(socio1.toString());
		
		Prestamo prestamo1 = new Prestamo(501, 401, 200, 4, 20);
		System.out.println(prestamo1.toString());
		
		System.out.println(libro1.toString());
		System.out.println(cintavideo1.toString());
		System.out.println(cintavideo1.Protagonistas());
		System.out.println(cintaaudio1.toString());
		
	}

}
