package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Doencas;
import com.repository.DoencasRepository;
import com.service.exception.DoencaNaoEncontradaException;

@Service
public class DoencasService {

	@Autowired
	DoencasRepository repository;
	
	public List<Doencas> todos() {
		return repository.findAll();
	}

	public Doencas novo(Doencas doencas) {
		return repository.save(doencas);
	}

	public Doencas busca(Integer id) {
		return repository.findById(id).orElseThrow(()-> new DoencaNaoEncontradaException(id));
	}

	public Doencas atualiza(Doencas doencas, Integer id) {
		doencas.setId(id);
		return repository.save(doencas);
	}

	public void exclui(Integer id) {
		repository.deleteById(id);
	}

}
