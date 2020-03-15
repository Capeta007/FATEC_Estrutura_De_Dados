package pilhas.exemplo.controller;

public class Livro {
	private int numreg;
	private String titulo;
	private String autor;
	private Double preco;
	private Livro Anterior;


	public Livro(int numreg, String titulo, String autor, Double preco) {
		super();
		this.numreg = numreg;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	
	public Livro getAnterior() {
		return Anterior;
	}


	public void setAnterior(Livro anterior) {
		Anterior = anterior;
	}
	
	public int getNumreg() {
		return numreg;
	}


	public void setNumreg(int numreg) {
		this.numreg = numreg;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

	
}
