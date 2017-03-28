package br.com.rfa.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean {
	private List<Integer> itens;
	
	public CadastroPedidoBean(){
		itens = new ArrayList<>();
		itens.add(1);
		
		System.out.println(itens.size());
	}
	
	public List<Integer> getItens(){
		return itens;
	}
	
}
