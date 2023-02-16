package com.generation.redesocial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo assunto é obrigatório")
	private String assunto;
	
	@NotNull (message = "O atributo aprovação é obrigatório")
	private boolean aprovacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public boolean isAprovacao() {
		return aprovacao;
	}

	public void setAprovacao(boolean aprovacao) {
		this.aprovacao = aprovacao;
	}

}
