package lista.linear.simplesmente.encadeada.exercicio3;

import lista.linear.simplesmente.encadeada.exercicio2.Aluno;

public class Node {

	private Aluno element;
	private int next;
	
	
	public Node(Aluno element, int next) {
		super();
		this.element = element;
		this.next = next;
	}


	public Aluno getElement() {
		return element;
	}


	public void setElement(Aluno element) {
		this.element = element;
	}


	public int getNext() {
		return next;
	}


	public void setNext(int next) {
		this.next = next;
	}

	
}