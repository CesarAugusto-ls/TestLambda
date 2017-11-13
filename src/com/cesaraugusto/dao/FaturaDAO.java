package com.cesaraugusto.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cesaraugusto.modelo.Fatura;

public class FaturaDAO {
	
	public List<Fatura> buscarFaturasVencidas(){
		
		Fatura f1 = new Fatura("ze1@ze1.com.br", 350.00, LocalDate.now().minusDays(3));
		Fatura f2 = new Fatura("maria@maria.com.br", 150.00, LocalDate.now().minusDays(2));
		Fatura f3 = new Fatura("joao@joao.com.br", 250.00, LocalDate.now().minusDays(5));	
		
		return Arrays.asList(f1, f2, f3);
	}

}