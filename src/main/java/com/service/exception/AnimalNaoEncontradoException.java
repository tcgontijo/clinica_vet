package com.service.exception;

public class AnimalNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AnimalNaoEncontradoException(Integer id) {
		super("Animal com o Id = " + id + "não encontrada!");
	}

}
