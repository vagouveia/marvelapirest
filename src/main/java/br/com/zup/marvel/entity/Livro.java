package br.com.zup.marvel.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRO_COMIC")
public class Livro implements Serializable {

	
	private static final long serialVersionUID = 3858694183324410368L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_LIVRO")
	private Long codigo;
	
	@Column(name = "COMIC_ID")
	private Long comicId;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "PRECO")
	private Double preco;
	
	@Column(name = "AUTOR")
	private String autor;
	
	@Column(name = "IBSN")
	private String ibsn;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "DESCONTO_ATIVO")
	private Boolean descontoAtivo;
	
	@Column(name = "DIA_DESCONTO")
	private String diaDesconto;
	
	/*
	 * @OneToMany(targetEntity = Usuario.class, mappedBy = "livro", fetch =
	 * FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
	 * 
	 * @Column(name = "COD_USUARIO") private List<Usuario> usuarios;
	 */
	
	public Livro() {
		super();
	}

	public Livro(Long codigo, Long comicId, String titulo, Double preco, String autor, String ibsn, String descricao,
			Boolean descontoAtivo, String diaDesconto) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((comicId == null) ? 0 : comicId.hashCode());
		result = prime * result + ((descontoAtivo == null) ? 0 : descontoAtivo.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((diaDesconto == null) ? 0 : diaDesconto.hashCode());
		result = prime * result + ((ibsn == null) ? 0 : ibsn.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (comicId == null) {
			if (other.comicId != null)
				return false;
		} else if (!comicId.equals(other.comicId))
			return false;
		if (descontoAtivo == null) {
			if (other.descontoAtivo != null)
				return false;
		} else if (!descontoAtivo.equals(other.descontoAtivo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (diaDesconto == null) {
			if (other.diaDesconto != null)
				return false;
		} else if (!diaDesconto.equals(other.diaDesconto))
			return false;
		if (ibsn == null) {
			if (other.ibsn != null)
				return false;
		} else if (!ibsn.equals(other.ibsn))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	
	

}
