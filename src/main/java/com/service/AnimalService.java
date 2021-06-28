package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Animal;
import com.repository.AnimalRepository;
import com.service.exception.AnimalNaoEncontradoException;

@Service
public class AnimalService {

	@Autowired
	AnimalRepository repository;

	public List<Animal> todos() {
		return repository.findAll();
	}

	public Animal novo(Animal animal) {
		return repository.save(animal);
	}

	public Animal busca(Integer id) {
		return repository.findById(id).orElseThrow(()-> new AnimalNaoEncontradoException(id));
	}

	public Animal atualiza(Animal animal, Integer id) {
		animal.setId(id);
		return repository.save(animal);
	}

	public void exclui(Integer id) {
		repository.deleteById(id);
	}

}
