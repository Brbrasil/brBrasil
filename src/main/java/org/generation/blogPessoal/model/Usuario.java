package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O atributo Nome é Obrigatório!")
	private String nome;

	@Size(max = 5, message = "O link da foto não pode ser maior do que 5000 caractéres")
	private String agencia;
	
	@Size(max = 10, message = "O link da foto não pode ser maior do que 5000 caractéres")
	private String conta;
	
	
	@Schema(example = "email@email.com.br")
	@Email(message = "O atributo Usuário deve ser um email válido!")
	private String usuario;

	@NotBlank(message = "O atributo Senha é Obrigatório!")
	@Size(min = 4, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	@Size(max = 4, message = "O link da foto não pode ser maior do que 5000 caractéres")
	private String senha_digitos;
	
	@Size(max = 11, message = "O link da foto não pode ser maior do que 5000 caractéres")
	private String cpf;
	
	@Size(max = 11, message = "O link da foto não pode ser maior do que 5000 caractéres")
	private String telefone;
	
	private String tipo_conta;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public Usuario(Long id, String nome, String agencia, String conta, String usuario, String senha, String senha_digitos, String cpf, String telefone, String tipo_conta) {
		this.id = id;
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.usuario = usuario;
		this.senha = senha;
		this.senha_digitos = senha_digitos;
		this.cpf = cpf;
		this.telefone = telefone;
		this.tipo_conta = tipo_conta;
		
		
	}

	public Usuario() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha_digitos() {
		return senha_digitos;
	}

	public void setSenha_digitos(String senha_digitos) {
		this.senha_digitos = senha_digitos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo_conta() {
		return tipo_conta;
	}

	public void setTipo_conta(String tipo_conta) {
		this.tipo_conta = tipo_conta;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}



}