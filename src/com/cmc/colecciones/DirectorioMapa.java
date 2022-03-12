package com.cmc.colecciones;

import java.util.HashMap;

import com.cmc.entidades.Contacto;

public class DirectorioMapa extends Directorio {
	private HashMap<String, Contacto> contactos;
	
	public DirectorioMapa(){
		contactos = new HashMap<String, Contacto>();
	}
	
	public void agregarContacto(Contacto c){
		if(!contactos.containsKey(c.getCedula())){
			contactos.put(c.getCedula(), c);
		}
	}
	public Contacto buscarContacto(String cedula){
		if(!contactos.containsKey(cedula)){
			return contactos.get(cedula);
		}
		return null;
	}
	public Contacto eliminarContacto(String cedula){
		contactos.keySet().remove(cedula);
		return contactos.get(cedula);
	}
	public void imprimir(){
		System.out.println(contactos);
	}
}
