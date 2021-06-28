package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Anamnese;
import com.repository.AnamneseRepository;
import com.service.exception.AnamneseNaoEncontradaException;

@Service
public class AnamneseService {

	@Autowired
	AnamneseRepository repository;

	public List<Anamnese> todos() {
		return repository.findAll();
	}

	public Anamnese novo(Anamnese anamnese) {
		return repository.save(anamnese);
	}

	public Anamnese busca(Integer id) {
		return repository.findById(id).orElseThrow(() -> new AnamneseNaoEncontradaException(id));
	}

	public Anamnese atualiza(Anamnese anamnese, Integer id) {
		anamnese.setId(id);

		return repository.save(anamnese);
	}

	public void exclui(Integer id) {
		repository.deleteById(id);
	}

}
