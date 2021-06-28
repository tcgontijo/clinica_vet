package com.service.exception;

public class DoencaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DoencaNaoEncontradaException(Integer id) {
		super("Doença com o Id = " + id + "não encontrada!");
	}

}
