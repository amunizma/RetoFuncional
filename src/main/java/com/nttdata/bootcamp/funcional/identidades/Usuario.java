package com.nttdata.bootcamp.funcional.identidades;

import java.util.HashMap;

public class Usuario {
	
	private String nombre;
	private String username;
	private String password;
	
	public Usuario(String nombre, String username, String password) {
		super();
		this.nombre = nombre;
		this.username = username;
		this.password = password;
	}
	
	public HashMap<String, String[]> toParams() {
		var mapa = new HashMap<String, String[]>();
		mapa.put(this.username, new String[] {this.username, this.password, this.nombre});
		return mapa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
