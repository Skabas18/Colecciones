package com.cmc.entidades;

import java.util.ArrayList;

public class Contacto {
	private String cedula, nombre, apellido;
	private ArrayList<Telefono> telefonos= new ArrayList<Telefono>();
	public Contacto(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Contacto [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", operadora="
				+ telefonos + "]";
	}
	public void agregarTelefono(Telefono telefono){
		telefonos.add(telefono);
	}
}
