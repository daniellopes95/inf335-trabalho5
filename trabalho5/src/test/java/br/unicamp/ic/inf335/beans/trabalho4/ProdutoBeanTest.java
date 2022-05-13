package br.unicamp.ic.inf335.beans.trabalho4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {

	@Test
	public void compareToGreater() {
		ProdutoBean p1 = new ProdutoBean();
		ProdutoBean p2 = new ProdutoBean();
		
		p1.setValor(5.0);
		p2.setValor(3.0);
		
		int resultado = p1.compareTo(p2);
		assertEquals(resultado, 1);
	}
	
	@Test
	public void compareToLower() {
		ProdutoBean p1 = new ProdutoBean();
		ProdutoBean p2 = new ProdutoBean();
		
		p1.setValor(3.0);
		p2.setValor(5.0);
		
		int resultado = p1.compareTo(p2);
		assertEquals(resultado, -1);
	}
	
	@Test
	public void compareToEqual() {
		ProdutoBean p1 = new ProdutoBean();
		ProdutoBean p2 = new ProdutoBean();
		
		p1.setValor(5.0);
		p2.setValor(5.0);
		
		int resultado = p1.compareTo(p2);
		assertEquals(resultado, 0);
	}
	
}
