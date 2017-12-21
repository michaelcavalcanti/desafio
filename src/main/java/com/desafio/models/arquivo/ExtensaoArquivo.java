package com.desafio.models.arquivo;

public enum ExtensaoArquivo {

	pdf("pdf"),doc("doc"),txt("txt"),img("img");

	private String extensao;

	ExtensaoArquivo(String nome){
		setExtensao(nome);
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}



}
