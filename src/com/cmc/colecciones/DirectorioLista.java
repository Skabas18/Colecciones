package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio{
	
	private ArrayList<Contacto> contactos;
	
	public void agregarContacto(Contacto c){
		for (Contacto contacto : contactos) {
			if(!contacto.getCedula().equals(c.getCedula())){
				contactos.add(c);
			}
		}
		
	}
	public Contacto buscarContacto(String cedula){
		for (Contacto contacto : contactos) {
			if(contacto.getCedula().equals(cedula)){
				return contacto;
			}
		}
		return null;
	}
	public Contacto eliminarContacto(String cedula){
		for (Contacto contacto : contactos) {
			if(contacto.getCedula().equals(cedula)){}
				contactos.remove(contacto);
				return contacto;
		}
		
		return null;
	}
	public void imprimir(){
		for (Contacto contacto : contactos) {
			System.out.println(contacto);
		}
	}
}
