package com.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Exame implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Boolean hemograma;
	private Boolean colesterol;
	private Boolean fosforo;
	private Boolean calcio;
	private Boolean glicose;
	private Boolean magnesio;
	private Boolean ureia;
	private Boolean potassio;
	private String ultrassom;
	private String radiografia;
	private String data;

	@NotBlank(message = "O campo Animal é obrigatório!")
	@JsonBackReference
	@ManyToOne
	private Animal animal;

	// @Pattern(regexp =
	// "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$", message =
	// "A data deve conter o formato aaaa-mm-dd")

}
