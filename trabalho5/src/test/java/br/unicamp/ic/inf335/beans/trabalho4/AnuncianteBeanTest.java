package br.unicamp.ic.inf335.beans.trabalho4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {

	@Test
	void valorMedioAnuncios() {
		AnuncianteBean anunciante = new AnuncianteBean();
		
		ProdutoBean p1 = new ProdutoBean();
		ProdutoBean p2 = new ProdutoBean();
		ProdutoBean p3 = new ProdutoBean();
		
		AnuncioBean a1 = new AnuncioBean();
		AnuncioBean a2 = new AnuncioBean();
		AnuncioBean a3 = new AnuncioBean();
		
		p1.setValor(250.0);
		p2.setValor(250.0);
		p3.setValor(100.0);
		
		a1.setProduto(p1);
		a2.setProduto(p2);
		a3.setProduto(p3);
		
		anunciante.addAnuncio(a1);
		anunciante.addAnuncio(a2);
		anunciante.addAnuncio(a3);
	
		double result = anunciante.valorMedioAnuncios();
		
		assertEquals(result, 200.0);
	}

}