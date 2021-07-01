package br.com.zup.marvel.dto;

import javax.validation.constraints.Size;

public class LivroDTO {

	private Long codigo;	
	private Long comicId;
	
	@Size(min = 1, max = 255)
	private String titulo;	
	
	private Double preco;	
	
	@Size(min = 1, max = 255)
	private String autor;
	
	@Size(min = 1, max = 255)
	private String ibsn;
	
	@Size(min = 1, max = 255)
	private String descricao;
	
	private Boolean descontoAtivo;
	
	private String diaDesconto;
	
	public LivroDTO() {
		super();
	}

	public LivroDTO(Long codigo, Long comicId, @Size(min = 1, max = 255) String titulo, Double preco,
			@Size(min = 1, max = 255) String autor, @Size(min = 1, max = 255) String ibsn,
			@Size(min = 1, max = 255) String descricao, Boolean descontoAtivo, String diaDesconto) {
		super();
		this.codigo = codigo;
		this.comicId = comicId;
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
		this.ibsn = ibsn;
		this.descricao = descricao;
		this.descontoAtivo = descontoAtivo;
		this.diaDesconto = diaDesconto;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getComicId() {
		return comicId;
	}

	public void setComicId(Long comicId) {
		this.comicId = comicId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIbsn() {
		return ibsn;
	}

	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getDescontoAtivo() {
		return descontoAtivo;
	}

	public void setDescontoAtivo(Boolean descontoAtivo) {
		this.descontoAtivo = descontoAtivo;
	}

	public String getDiaDesconto() {
		return diaDesconto;
	}

	public void setDiaDesconto(String diaDesconto) {
		this.diaDesconto = diaDesconto;
	}


	
	

}
