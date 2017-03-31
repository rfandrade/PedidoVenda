package br.com.rfa.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PesquisaPedidosBean {

	
	private List<Integer> pedidosFiltrados;
	
	public PesquisaPedidosBean(){
		pedidosFiltrados = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			pedidosFiltrados.add(i);
		}
		System.out.println(pedidosFiltrados.size());
	}
	
	public List<Integer> getPedidosFiltrados(){
		return pedidosFiltrados;
	}
	
	
}
