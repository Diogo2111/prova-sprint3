package br.com.compass.avaliacao.controller.form;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sun.istack.NotNull;

import br.com.compass.avaliacao.modelo.Estado;
import br.com.compass.avaliacao.modelo.Regiao;
import br.com.compass.avaliacao.repository.EstadoRepository;

public class EstadoForm {

	private String nome;
	@Enumerated(EnumType.STRING)
	private Regiao regiao;

	private Long populacao;

	private String capital;

	private Long area;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public Long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Estado converter(EstadoRepository repository) {
		return new Estado(nome, regiao, populacao, capital, area);
	}

}
