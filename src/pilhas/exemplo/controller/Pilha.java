package pilhas.exemplo.controller;

public class Pilha {
	private Livro fim;
	
	public Pilha() {
		fim = (Livro) null;
	}
	
	
	public void adicionaLivro(int numreg, String titulo, String autor, Double preco) {
		Livro livro = new Livro(numreg, titulo, autor, preco);
		livro.setAnterior(fim);
		fim = livro;
		
	}
	
	public void listarLivro() {
		Livro atual = fim;
		while (atual != null) {
			System.out.println("Cod: " + atual.getNumreg() + "\n Título: " + atual.getTitulo() + "\n Autor: " + atual.getAutor() 
			 + "\n Preço: " + atual.getPreco());
			atual = atual.getAnterior();
		}
	}
	public void push(Livro a) {
		a.setAnterior(fim);
		fim = a;
	}
	
	public void pop() {
		fim = fim.getAnterior();
	}
}
