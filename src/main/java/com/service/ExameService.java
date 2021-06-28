package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Exame;
import com.repository.ExameRepository;
import com.service.exception.ExameNaoEncontradoException;

@Service
public class ExameService {

	@Autowired
	ExameRepository repository;
	
	public List<Exame> todos() {
		return repository.findAll();
	}

	public Exame novo(Exame exame) {
		return repository.save(exame);
	}

	public Exame busca(Integer id) {
		return repository.findById(id).orElseThrow(()-> new ExameNaoEncontradoException(id));
	}

	public Exame atualiza(Exame exame, Integer id) {
		exame.setId(id);
		return repository.save(exame);
	}

	public void exclui(Integer id) {
		repository.deleteById(id);
	}

}
