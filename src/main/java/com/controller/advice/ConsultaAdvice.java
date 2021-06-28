package com.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.service.exception.ConsultaNaoEncontradaException;

@ControllerAdvice
public class ConsultaAdvice {

	@ResponseBody
	@ExceptionHandler(ConsultaNaoEncontradaException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String ConsultaNaoEncontrada(ConsultaNaoEncontradaException ex) {
		return ex.getMessage();
	}

}
