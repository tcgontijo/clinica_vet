package com.service.exception;

public class ExameNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExameNaoEncontradoException(Integer id) {
		super("Exame com o Id = " + id + "não encontrada!");
	}

}
