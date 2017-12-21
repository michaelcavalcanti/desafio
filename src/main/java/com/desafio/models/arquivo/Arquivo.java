package com.desafio.models.arquivo;

public class Arquivo {


	private String nomeArquivo;
	private ExtensaoArquivo extensao;
	private CapturaArquivo captura;

	public Arquivo(String nomeArquivo, ExtensaoArquivo extensao, CapturaArquivo captura){
		setNomeArquivo(nomeArquivo);
		setExtensao(extensao);
		setCaptura(captura);
	}

	public ExtensaoArquivo getExtensao() {
		return extensao;
	}

	public void setExtensao(ExtensaoArquivo extensao) {
		this.extensao = extensao;
	}

	public CapturaArquivo getCaptura() {
		return captura;
	}

	public void setCaptura(CapturaArquivo captura) {
		this.captura = captura;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

}
