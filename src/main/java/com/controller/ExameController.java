package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Exame;
import com.service.ExameService;

@RestController
@RequestMapping("/exame")
public class ExameController {

	@Autowired
	ExameService service;

	@GetMapping
	public List<Exame> recuperaTodosRegistros() {
		return service.todos();
	}

	@PostMapping
	public Exame criaNovoRegistro(@Valid @RequestBody Exame exame) {
		return service.novo(exame);
	}

	@GetMapping("/{id}")
	public Exame buscaUmRegistro(@PathVariable Integer id) {
		return service.busca(id);
	}

	@PutMapping("/{id}")
	public Exame atualizaRegistro(@Valid @RequestBody Exame exame, @PathVariable Integer id) {
		return service.atualiza(exame, id);
	}

	@DeleteMapping("/{id}")
	void excluiRegistro(@PathVariable Integer id) {
		service.exclui(id);
	}

}
