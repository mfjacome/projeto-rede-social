package com.generation.redesocial.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Caixa de texto não deve ser vazio, digite algo.")
	@Size(min = 5, max = 500)
	private String caixatexto;

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCaixatexto() {
		return caixatexto;
	}

	public void setCaixatexto(String caixatexto) {
		this.caixatexto = caixatexto;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
}
