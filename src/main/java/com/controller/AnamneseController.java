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

import com.domain.Anamnese;
import com.service.AnamneseService;

@RestController
@RequestMapping("/anamnese")
public class AnamneseController {

	@Autowired
	AnamneseService service;

	@GetMapping
	public List<Anamnese> recuperaTodosRegistros() {
		return service.todos();
	}

	@PostMapping
	public Anamnese criaNovoRegistro(@Valid @RequestBody Anamnese anamnese) {
		return service.novo(anamnese);
	}

	@GetMapping("/{id}")
	public Anamnese buscaUmRegistro(@PathVariable Integer id) {
		return service.busca(id);
	}

	@PutMapping("/{id}")
	public Anamnese atualizaRegistro(@Valid @RequestBody Anamnese anamnese, @PathVariable Integer id) {
		return service.atualiza(anamnese, id);
	}

	@DeleteMapping("/{id}")
	void excluiRegistro(@PathVariable Integer id) {
		service.exclui(id);
	}

}
