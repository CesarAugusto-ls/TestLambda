package com.cesaraugusto.Teste;

import java.util.List;

import com.cesaraugusto.dao.FaturaDAO;
import com.cesaraugusto.email.EnviadorDeEmail;
import com.cesaraugusto.modelo.Fatura;

public class TesteExemplo {
	
	public static void main(String[] args){
		EnviadorDeEmail enviarEmail = new EnviadorDeEmail();
				
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		/*
		for(Fatura f : faturasVencidas){
			enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
		}
		*/
		
		faturasVencidas.forEach((Fatura f) -> {
			
			enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
			
		});
		
	}
}