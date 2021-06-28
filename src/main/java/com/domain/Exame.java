package com.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

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
	private Date data;
	
	@NotBlank(message = "O campo Animal é obrigatório!")
	@ManyToOne
	private Animal animal;

}
