package com.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.service.exception.AnamneseNaoEncontradaException;

@ControllerAdvice
public class AnamneseAdvice {

	@ResponseBody
	@ExceptionHandler(AnamneseNaoEncontradaException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String AnamneseNaoEncontrada(AnamneseNaoEncontradaException ex) {
		return ex.getMessage();
	}

}
