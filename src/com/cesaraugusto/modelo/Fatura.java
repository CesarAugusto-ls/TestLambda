package com.cesaraugusto.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fatura {
	
	private String emailDevedor;
	private double valor;
	private LocalDate datavencimento;
	
	public Fatura(String emailDevedor, double valor, LocalDate datavencimento) {
		super();
		this.emailDevedor = emailDevedor;
		this.valor = valor;
		this.datavencimento = datavencimento;
	}
	
	public String getEmailDevedor() {
		return emailDevedor;
	}
	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getDatavencimento() {
		return datavencimento;
	}
	public void setDatavencimento(LocalDate datavencimento) {
		this.datavencimento = datavencimento;
	}
	
	public String resumo(){
		String dataVencimento = this.datavencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return String.format("Valor: R$ %s, Vencimento: %s", this.valor, dataVencimento);
	}
	
}
