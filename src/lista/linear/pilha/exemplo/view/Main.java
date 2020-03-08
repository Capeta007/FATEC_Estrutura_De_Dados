package lista.linear.pilha.exemplo.view;

import lista.linear.pilha.exemplo.controller.ListaLigada;

public class Main {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adicionaLivro(1, "Tit1", "aut1", 1.0);
		lista.adicionaLivro(2, "Tit2", "aut2", 1.0);
		lista.adicionaLivro(3, "Tit3", "aut3", 1.0);
		lista.adicionaLivro(4, "Tit4", "aut4", 1.0);
		lista.listarLivro();
		

	}

}
