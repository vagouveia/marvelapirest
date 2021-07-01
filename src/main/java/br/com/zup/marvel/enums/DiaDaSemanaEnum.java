package br.com.zup.marvel.enums;

public enum DiaDaSemanaEnum {
	
	SEGUNDAFEIRA(2),
	TERCAFEIRA(3),
	QUARTAFEIRA(4),
	QUINTAFEIRA(5),
	SEXTAFEIRA(6),
	
	SEGUNDA("Segunda-feira"),
	TERCA("Terca-feira"),
	QUARTA("Quarta-feira"),
	QUINTA("Quinta-feira"),
	SEXTA("Sexta-feira");
	
	private Integer diaSemana;
	
	private String descricao;
	
	DiaDaSemanaEnum(Integer diaSemana){
		this.diaSemana = diaSemana;
	}

	DiaDaSemanaEnum(String descricao){
		this.descricao = descricao;
	}
	
	public Integer getDiaSemana() {
		return diaSemana;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
