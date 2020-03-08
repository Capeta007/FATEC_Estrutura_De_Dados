package lista.linear.simplesmente.encadeada.exercicio1;

import javax.lang.model.element.Element;

public class SLinkedList {

	protected Node head;
	protected long size;

	public SLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public Object addCabeca(String element) {
		Node newNode;
		if (size == 0) {

			newNode = new Node(element, null);
			head = newNode;
			size++;
		} else {

			newNode = new Node(element, head);
			head = newNode;
			size++;
		}
		return newNode;

	}

	public Object addCauda(String element) {

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
			return newNode;
		}

		return null;
	}

	public Object add(String element, int index) {

		if (size >= 0 && size >= index) {
			Node atual = head;
			Node ult = null;
			int i = 0;
			while (atual != null && index != i) {
                i++;
				ult = atual;
				atual = atual.getNext();

			}

			if (ult == null) {
				Node newNode = new Node(element, atual);
				head = newNode;
				size++;
				return newNode;
			}else {
				Node newNode = new Node(element, atual);
				ult.setNext(newNode);
				size++;
				return newNode;
			}

		}
		return null;

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

	public void remove(String index) {
		Node node = head;
		Node ult = null;

		while(node != null && node.equals(index)) {
			ult = node;
			node = node.getNext();
		}

		if (ult == null) {
			head = node.getNext();
			size--;
		} else {
			ult.setNext(node.getNext());
			size--;
		}
		
		

	}
	
	public void remove(int index) {
		Node node = head;
		Node ult = null;

		int i = 0;
		
		while(node != null && i != index) {
			ult = node;
			node = node.getNext();
			i++;
		}

		if (ult == null) {
			head = node.getNext();
			size--;
		} else {
			ult.setNext(node.getNext());
			size--;
		}
		

	}
	
	public boolean contains(String index) {
		
		Node find = head;
		
        if(head.getElement().equals(index)) {
        	return true;
        }
		
		for (int i = 1; i < size; i++) {
			
			find = find.getNext();
			
			if(find.getElement().equals(index)) {
	        	return true;
	        }
		}
		
		
		return false;
		
	}

	public long tamanho() {
		return size;
	}
}
