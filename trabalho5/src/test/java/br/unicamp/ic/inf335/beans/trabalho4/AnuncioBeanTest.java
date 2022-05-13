package br.unicamp.ic.inf335.beans.trabalho4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {

	@Test
	void getValorDesconto0() {
		AnuncioBean a = new AnuncioBean(); 
		ProdutoBean p = new ProdutoBean();
		
		p.setValor(100.0);
		a.setProduto(p);
		
		a.setDesconto(0.0);
		
		double resultado = a.getValor();
		
		assertEquals(resultado, 100.0);
	}

	@Test
	void getValorDesconto40() {
		AnuncioBean a = new AnuncioBean(); 
		ProdutoBean p = new ProdutoBean();
		
		p.setValor(100.0);
		a.setProduto(p);
		
		a.setDesconto(0.40);
		
		double resultado = a.getValor();
		
		assertEquals(resultado, 60.0);
	}
	
	@Test
	void getValorDesconto100() {
		AnuncioBean a = new AnuncioBean(); 
		ProdutoBean p = new ProdutoBean();
		
		p.setValor(100.0);
		a.setProduto(p);
		
		a.setDesconto(1.0);
		
		double resultado = a.getValor();
		
		assertEquals(resultado, 0.0);
	}
}
