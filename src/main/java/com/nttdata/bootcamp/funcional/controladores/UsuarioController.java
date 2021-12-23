package com.nttdata.bootcamp.funcional.controladores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.funcional.identidades.Usuario;

@RestController
public class UsuarioController {
	
	private ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
	
	public UsuarioController() {
		listUsuarios.add(new Usuario("Juan", "jmd18","123456"));
		listUsuarios.add(new Usuario("Ana", "amd18","123456"));
		listUsuarios.add(new Usuario("Pepe", "pmd18","123456"));
	}
	

	
	@GetMapping("/login")
	public String login(@RequestParam(value = "user") String username, @RequestParam(value = "password") String password) {
		var resultado = listUsuarios.stream().filter(
		u -> u.getUsername().equals(username) && u.getPassword().equals(password)
		).collect(Collectors.toList()).get(0);
		
		return "Hola " + resultado.getNombre();
	}
	

}
