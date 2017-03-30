package br.com.rfa.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PesquisaProdutosBean {
	
	private List<Integer> produtosFiltrados;
	
	public PesquisaProdutosBean(){
		produtosFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			produtosFiltrados.add(i);
		}
		System.out.println(produtosFiltrados.size());
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}

	public void setProdutosFiltrados(List<Integer> produtosFiltrados) {
		this.produtosFiltrados = produtosFiltrados;
	}
	

}
