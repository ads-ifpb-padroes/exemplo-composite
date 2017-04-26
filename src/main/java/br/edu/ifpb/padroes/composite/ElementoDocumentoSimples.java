package br.edu.ifpb.padroes.composite;

public abstract class ElementoDocumentoSimples implements Elemento {
	
	public void insere(Elemento elemento) {
		throw new UnsupportedOperationException();
	}

	public void remove(Elemento elemento) {
		throw new UnsupportedOperationException();
	}

}