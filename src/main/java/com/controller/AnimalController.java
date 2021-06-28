package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Animal;
import com.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	AnimalService service;

	@GetMapping
	public List<Animal> recuperaTodosRegistros() {
		return service.todos();
	}

	@PostMapping
	public Animal criaNovoRegistro(@RequestBody Animal animal) {
		return service.novo(animal);
	}

	@GetMapping("/{id}")
	public Animal buscaUmRegistro(@PathVariable Integer id) {
		return service.busca(id);
	}

	@PutMapping("/{id}")
	public Animal atualizaRegistro(@RequestBody Animal animal, @PathVariable Integer id) {
		return service.atualiza(animal, id);
	}

	@DeleteMapping("/{id}")
	void excluiRegistro(@PathVariable Integer id) {
		service.exclui(id);
	}

}
