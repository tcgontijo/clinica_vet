package com.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.service.exception.ExameNaoEncontradoException;

@ControllerAdvice
public class ExameAdvice {

	@ResponseBody
	@ExceptionHandler(ExameNaoEncontradoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String DoencaNaoEncontrada(ExameNaoEncontradoException ex) {
		return ex.getMessage();
	}
}
