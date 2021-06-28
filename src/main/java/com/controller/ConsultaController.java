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

import com.domain.Consulta;
import com.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	ConsultaService service;

	@GetMapping
	public List<Consulta> recuperaTodosRegistros() {
		return service.todos();
	}

	@PostMapping
	public Consulta criaNovoRegistro(@Valid @RequestBody Consulta consulta) {
		return service.novo(consulta);
	}

	@GetMapping("/{id}")
	public Consulta buscaUmRegistro(@PathVariable Integer id) {
		return service.busca(id);
	}

	@PutMapping("/{id}")
	public Consulta atualizaRegistro(@Valid @RequestBody Consulta consulta, @PathVariable Integer id) {
		return service.atualiza(consulta, id);
	}

	@DeleteMapping("/{id}")
	void excluiRegistro(@PathVariable Integer id) {
		service.exclui(id);
	}

}
