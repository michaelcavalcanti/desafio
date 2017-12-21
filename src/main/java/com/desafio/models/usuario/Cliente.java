package com.desafio.models.usuario;

public class Cliente extends Usuario {

	private Autorizacoes autorizacoes;

	public Cliente(String nome, String senha, Autorizacoes autorizacoes) {
		super(nome, senha);
		setAutorizacoes(autorizacoes);
	}

	public Autorizacoes getAutorizacoes() {
		return autorizacoes;
	}

	public void setAutorizacoes(Autorizacoes autorizacoes) {
		this.autorizacoes = autorizacoes;
	}

	public boolean isAdmin() {
		return false;
	}

}
