package com.desafio.models.documento;

import com.desafio.models.arquivo.Arquivo;
import com.desafio.models.usuario.Cliente;

public class ProcessarDocumento {



	public ProcessarDocumento(Arquivo arquivo, Cliente cliente){

		checarDocumento(arquivo, cliente);

	}

	public boolean checarExtensao(Arquivo arquivo, Cliente cliente) {

		boolean r = false;
		if (arquivo.getExtensao().getExtensao().equals("pdf")) {
			if (cliente.getAutorizacoes().isPdf() == true) {
				r = true;
			}
		} else if (arquivo.getExtensao().getExtensao().equals("txt")) {
			if (cliente.getAutorizacoes().isTxt() == true) {
				r = true;
			}

		} else if (arquivo.getExtensao().getExtensao().equals("doc")) {
			if (cliente.getAutorizacoes().isDoc() == true) {
				r = true;
			}
		} else if (arquivo.getExtensao().getExtensao().equals("img")) {
			if (cliente.getAutorizacoes().isTxt() == true) {
				r = true;
			}
		}
		return r;
	}

	public boolean checarCaptura(Arquivo arquivo, Cliente cliente){
		boolean r = false;
		if (arquivo.getCaptura().getCaptura().equals("web")) {
			if (cliente.getAutorizacoes().isWeb() == true) {
				r = true;
			}
		} else if (arquivo.getCaptura().getCaptura().equals("desktop")) {
			if (cliente.getAutorizacoes().isDesktop() == true) {
				r = true;
			}

		} else if (arquivo.getCaptura().getCaptura().equals("mobile")) {
			if (cliente.getAutorizacoes().isMobile() == true) {
				r = true;
			}
		}
		return r;
	}

	public void checarDocumento(Arquivo arquivo, Cliente cliente){
		if(checarExtensao(arquivo,cliente) == true && checarCaptura(arquivo,cliente) == true){
			Documento documento = new Documento(arquivo, cliente);
		}else{
			throw new IllegalArgumentException("Voce nao tem essa autorizacao");
		}

	}

}
