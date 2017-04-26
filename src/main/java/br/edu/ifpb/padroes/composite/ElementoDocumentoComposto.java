package br.edu.ifpb.padroes.composite;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class ElementoDocumentoComposto implements Elemento {
	
	protected List<Elemento> filhos = new LinkedList<Elemento>();
	
	public void insere(Elemento elemento) {
		this.filhos.add(elemento);
	}

	public void remove(Elemento elemento) {
		this.filhos.remove(elemento);
	}

	public List<Elemento> getFilhos() {
		return Collections.unmodifiableList(filhos);
	}

	public void desenhar() {
		desenharComposto();
		for (Elemento elementoDocumento : filhos) {
			elementoDocumento.desenhar();
		}
	}

	protected abstract void desenharComposto();

}
