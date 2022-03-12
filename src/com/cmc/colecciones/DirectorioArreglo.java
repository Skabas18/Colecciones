package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo extends Directorio{
	private Contacto[] contactos;
	private int elementosAgregados;
	
	public void agregarContacto(Contacto c){
		if (elementosAgregados < contactos.length) {
			contactos[elementosAgregados] = c;
			elementosAgregados = elementosAgregados + 1;
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
			if(contacto.getCedula().equals(cedula)){
			}
		}
		return null;
	}
	public void imprimir(){
		System.out.println(contactos);
	}
}
