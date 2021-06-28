package com.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.service.exception.DoencaNaoEncontradaException;

@ControllerAdvice
public class DoencaAdvice {

	@ResponseBody
	@ExceptionHandler(DoencaNaoEncontradaException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String DoencaNaoEncontrada(DoencaNaoEncontradaException ex) {
		return ex.getMessage();
	}

}
