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

import com.domain.Doencas;
import com.service.DoencasService;

@RestController
@RequestMapping("/doencas")
public class DoencasController {

	@Autowired
	DoencasService service;

	@GetMapping
	public List<Doencas> recuperaTodosRegistros() {
		return service.todos();
	}

	@PostMapping
	public Doencas criaNovoRegistro(@Valid @RequestBody Doencas doencas) {
		return service.novo(doencas);
	}

	@GetMapping("/{id}")
	public Doencas buscaUmRegistro(@PathVariable Integer id) {
		return service.busca(id);
	}

	@PutMapping("/{id}")
	public Doencas atualizaRegistro(@Valid @RequestBody Doencas doencas, @PathVariable Integer id) {
		return service.atualiza(doencas, id);
	}

	@DeleteMapping("/{id}")
	void excluiRegistro(@PathVariable Integer id) {
		service.exclui(id);
	}

}
