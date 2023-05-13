package com.friendsandtechnology.leilao.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;
    private String email;
    private String cpf;
    private String agencia;
    private String conta;
    private String senha;
    private String telefone;
    private String senha_digitos;

    public Usuario() {

    }

    public Usuario(String id, String nome, String email, String senha, String cpf,String agencia, String conta,
            String telefone, String endereco, String senha_digitos) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.agencia = agencia;
        this.conta = conta;
        this.senha = senha;
        this.telefone = telefone;
        this.senha_digitos = senha_digitos;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha_digitos() {
		return senha_digitos;
	}

	public void setSenha_digitos(String senha_digitos) {
		this.senha_digitos = senha_digitos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
