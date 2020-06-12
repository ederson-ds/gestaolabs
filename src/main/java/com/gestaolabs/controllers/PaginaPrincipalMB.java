package com.gestaolabs.controllers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PaginaPrincipalMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private String mensagem = "Olá, sejam bem vindos!";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
