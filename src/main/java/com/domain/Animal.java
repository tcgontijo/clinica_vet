package com.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String foto;
	private String raca;
	private String pelagem;
	private Integer peso;
	private Integer tipo;
	private String dataNascimento;
	private String dataCadastro;
	private Integer estado;

	@JsonManagedReference
	@OneToMany(mappedBy = "animal")
	private List<Consulta> consultas = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy = "animal")
	private List<Exame> exames = new ArrayList<>();

}
