/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rennan.goldplanning.model;

/**
 *
 * @author rennan.lima
 */
public enum TipoCapacidade {

	LITROS("litros"), LIBRAS("lbs");

	private String descricao;

	TipoCapacidade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

}
