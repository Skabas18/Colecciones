package com.cmc.test;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestContactos {

	public static void main(String[] args) {
		Contacto c= new Contacto("123", "Sebastian", "Cabal");
		ArrayList<Telefono> tele= new ArrayList<Telefono>();
		c.agregarTelefono(new Telefono("Claro","789456"));
		System.out.println(c);
	}

}
