package br.com.compass.avaliacao.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.compass.avaliacao.modelo.Estado;
import br.com.compass.avaliacao.modelo.Regiao;

public class EstadoDto {

	private Long id;
	private String nome;  
	private Regiao regiao;
	private Long populacao;
	private String capital;
	private Long area;
	
	
	public EstadoDto() {
		
	}
	
	public EstadoDto(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public Long getPopulacao() {
		return populacao;
	}

	public String getCapital() {
		return capital;
	}

	public Long getArea() {
		return area;
	}

	public static List<EstadoDto> converter(List<Estado> estados) {
		
		return estados.stream().map(EstadoDto::new).collect(Collectors.toList());
	}

}
