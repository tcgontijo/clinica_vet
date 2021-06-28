package com.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Anamnese implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String problemaSistemaDigestivo;
	private String problemaSistemaUroGenital;
	private String problemaSistemaCardioRespiratorio;
	private String problemaSistemaNeurologico;
	private String problemaSistemaLocomotor;
	private String problemaPele;
	private String problemaOlhos;
	private String problemaOuvido;

	@ManyToMany
	@Size(min = 0, max = 5, message = "São permitidas até 5 doenças por Anamnese!")
	private List<Doencas> doencas = new ArrayList<>();

}
