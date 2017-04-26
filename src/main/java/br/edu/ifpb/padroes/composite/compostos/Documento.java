package br.edu.ifpb.padroes.composite.compostos;

import br.edu.ifpb.padroes.composite.ElementoDocumentoComposto;

public class Documento extends ElementoDocumentoComposto {

	public void desenharComposto() {
		System.out.println("Um documento contendo: ");
	}

}
