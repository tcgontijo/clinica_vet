package com.service.exception;

public class ConsultaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ConsultaNaoEncontradaException(Integer id) {
		super("Consulta com o Id = " + id + "não encontrada!");
	}

}
