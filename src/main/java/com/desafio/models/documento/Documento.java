package com.desafio.models.documento;

import java.util.Date;

import com.desafio.models.arquivo.Arquivo;
import com.desafio.models.usuario.Cliente;

public class Documento{

	private Arquivo arquivo;
	private Cliente cliente;
	private Date data;



	public Documento(Arquivo arquivo, Cliente cliente){
		setArquivo(arquivo);
		setCliente(cliente);
		setData(data = new Date());
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
