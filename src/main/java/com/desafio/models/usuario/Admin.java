package com.desafio.models.usuario;

import com.desafio.models.documento.Documento;

public class Admin extends Usuario {


	public Admin(String n, String s) {
		super(n, s);
	}

	public boolean isAdmin() {
		return true;
	}

	public void criarNovoCliente(String nome, String senha, Autorizacoes autorizacoes){
			Cliente cliente = new Cliente(nome, senha, autorizacoes);
	}

	public void setAutorizacoes(Cliente cliente, boolean web, boolean desktop, boolean mobile,
			boolean pdf, boolean doc, boolean txt, boolean img){
		cliente.setAutorizacoes(new Autorizacoes(web,desktop,mobile,pdf,doc,txt,img));
	}

	public String getDocumento(Documento documento){

		String informacoes = documento.getCliente().getNome() + "," + documento.getArquivo().getNomeArquivo() + "," +
		documento.getArquivo().getExtensao() + ", " + documento.getArquivo().getCaptura() + "," + documento.getData();

		return informacoes;
	}

}
