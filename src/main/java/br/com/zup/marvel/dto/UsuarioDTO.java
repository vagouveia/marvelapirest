package br.com.zup.marvel.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UsuarioDTO {

	private Long codigo;

	@NotNull
	@Size(min = 1, max = 255)
	private String nome;

	@NotNull
	@Size(min = 11, max = 11)
	private String cpf;

	@NotNull
	@Size(min = 1, max = 255)
	private String email;

	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	
	@NotNull
	private LivroDTO livro;


	public UsuarioDTO() {
		super();
	}


	public UsuarioDTO(Long codigo, @NotNull @Size(min = 1, max = 255) String nome,
			@NotNull @Size(min = 11, max = 11) String cpf, @NotNull @Size(min = 1, max = 255) String email,
			@NotNull Date dataNascimento, @NotNull LivroDTO livro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.livro = livro;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public LivroDTO getLivro() {
		return livro;
	}


	public void setLivro(LivroDTO livro) {
		this.livro = livro;
	}	
	
	

}
