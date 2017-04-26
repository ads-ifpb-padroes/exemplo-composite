package br.edu.ifpb.padroes.composite;

import br.edu.ifpb.padroes.composite.compostos.Documento;
import br.edu.ifpb.padroes.composite.compostos.Linha;
import br.edu.ifpb.padroes.composite.compostos.Pagina;
import br.edu.ifpb.padroes.composite.primitivos.Caractere;
import br.edu.ifpb.padroes.composite.primitivos.Poligono;

public class Loader {

	public static void main(String[] args) {
		Elemento documento = new Documento();
		Pagina pagina1 = new Pagina();

		Linha linha1 = new Linha();
		linha1.insere(new Caractere('D'));
		linha1.insere(new Caractere('I'));
		linha1.insere(new Caractere('O'));
		linha1.insere(new Caractere('G'));
		linha1.insere(new Caractere('O'));

		pagina1.insere(linha1);

		documento.insere(pagina1);

		documento.desenhar();

		Linha linha2 = new Linha();
		linha2.insere(new Caractere('O'));
		Caractere c = new Caractere('P');
		linha2.insere(c);
		c.insere(new Poligono()); // Vai dar erro

		documento.insere(linha2);

		documento.desenhar();
	}

}
