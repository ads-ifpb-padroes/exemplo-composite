package br.edu.ifpb.padroes.composite;

public interface Elemento {
	
	void desenhar();
	
	void insere(Elemento elemento);
	
	void remove(Elemento elemento);
	
}
