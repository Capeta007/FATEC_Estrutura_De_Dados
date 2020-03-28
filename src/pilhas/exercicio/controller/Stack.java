package pilhas.exercicio.controller;

public class Stack {
	
	private Expressao topo;
	
	public Stack() {
		
	}
	
	public void push(char elemento) {
		
		topo = new Expressao(elemento, topo);

	}
	
	public void pop() {
		
		topo = topo.getAnterior();
		
	}
	
	public char topo() {
		
		return topo.getText();
		
	}
	
	public boolean vazia() {
		
		if(topo == null) {
			return true;
		}else {
			return false;
		}
		
	}

}
