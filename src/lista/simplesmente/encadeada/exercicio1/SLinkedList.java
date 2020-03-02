package lista.simplesmente.encadeada.exercicio1;

import javax.lang.model.element.Element;

public class SLinkedList {

	protected Node head;
	protected long size;

	public SLinkedList() {
		super();
		this.head = null;
		this.size = 0;
	}

	public void add(String element) {

		if (size == 0) {

			Node newNode = new Node(element, null);
			head = newNode;
			size++;

		} else {

			Node newNode = new Node(element, head);
			head = newNode;
			size++;

		}

	}

	public void addCauda(String element) {

		if (size == 0) {

			Node newNode = new Node(element, null);
			head = newNode;
			size++;

		} else {

			Node nodes = head;
			Node ult = null;
			while (nodes != null) {

				ult = nodes;
				nodes = nodes.getNext();

			}

			Node newNode = new Node(element, null);
			ult.setNext(newNode);
			size++;

		}

	}

	public Object getIndex(int index) {

		if (size > 0 && size > index) {
			Node node = head;
			for (int i = 1; i <= index; i++) {
				node = node.getNext();
			}

			return node.getElement();

		} else {
			System.err.println("Posição não existe");
			return null;
		}

	}

	public void remove(int index) {

		if (size > 0) {

			if (index > 0 && size > index) {
				Node node = head;
				Node ult = null;
				for (int i = 1; i <= index; i++) {
					ult = node;
					node = node.getNext();
				}

				ult.setNext(node.getNext());
				size--;

			} else if (index == 0) {
				head = head.getNext();
				size--;
			} else {
				System.err.println("Posição não existe");
			}

		}
	}

	public long tamanho() {
		return size;
	}
}
