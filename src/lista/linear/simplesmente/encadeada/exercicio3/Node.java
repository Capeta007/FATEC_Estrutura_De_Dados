package lista.linear.simplesmente.encadeada.exercicio3;

public class Node<T> {
	
	private T object;
	private int next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(int next) {
		this.next = next;
	}

	public Node(T object, int next) {
		super();
		this.object = object;
		this.next = next;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

}