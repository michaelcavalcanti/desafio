package com.desafio.models.arquivo;

public enum CapturaArquivo {

	web("web"),desktop("desktop"),mobile("mobile");

	private String captura;

	CapturaArquivo(String captura){
		setCaptura(captura);
	}

	public String getCaptura() {
		return captura;
	}

	public void setCaptura(String captura) {
		this.captura = captura;
	}

}
