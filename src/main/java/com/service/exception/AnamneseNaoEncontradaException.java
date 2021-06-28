package com.service.exception;

public class AnamneseNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AnamneseNaoEncontradaException(Integer id) {
		super("Anamnese com o Id = " + id + " não encontrada!");
	}

}
