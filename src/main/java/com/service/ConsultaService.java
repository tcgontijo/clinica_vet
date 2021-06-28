package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Consulta;
import com.repository.ConsultaRepository;
import com.service.exception.ConsultaNaoEncontradaException;

@Service
public class ConsultaService {

	@Autowired
	ConsultaRepository repository;

	public List<Consulta> todos() {
		return repository.findAll();
	}

	public Consulta novo(Consulta consulta) {
		return repository.save(consulta);
	}

	public Consulta busca(Integer id) {
		return repository.findById(id).orElseThrow(()-> new ConsultaNaoEncontradaException(id));
	}

	public Consulta atualiza(Consulta consulta, Integer id) {
		consulta.setId(id);
		return repository.save(consulta);
	}

	public void exclui(Integer id) {
		repository.deleteById(id);
	}

}
