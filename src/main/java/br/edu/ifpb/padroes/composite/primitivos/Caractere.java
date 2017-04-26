package br.edu.ifpb.padroes.composite.primitivos;

import br.edu.ifpb.padroes.composite.ElementoDocumentoSimples;

public class Caractere extends ElementoDocumentoSimples {
	
	private Character charValue;
	
	public Caractere(Character charValue) {
		super();
		this.charValue = charValue;
	}

	public void desenhar() {
		System.out.print(charValue);
	}
	
}
