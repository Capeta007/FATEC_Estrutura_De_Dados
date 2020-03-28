package pilhas.exercicio.controller;

public class Expressao {
	
	private char text;
	private Expressao anterior;
	
	public Expressao(char text, Expressao anterior) {
		super();
		this.text = text;
		this.anterior = anterior;
	}

	public char getText() {
		return text;
	}

	public void setText(char text) {
		this.text = text;
	}

	public Expressao getAnterior() {
		return anterior;
	}

	public void setAnterior(Expressao anterior) {
		this.anterior = anterior;
	}

	
}
