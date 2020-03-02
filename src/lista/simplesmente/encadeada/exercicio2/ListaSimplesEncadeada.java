package lista.simplesmente.encadeada.exercicio2;

import lista.utilizando.referencia.Celula;

public class ListaSimplesEncadeada {

	private Node primeiro;
	private Node ultimo;
	private int size;

	public ListaSimplesEncadeada() {

	}

	public void add(Object element) {

		if (size == 0) {

			primeiro = new Node(element, null);
			ultimo = primeiro;
			size++;

		} else {

			
			ultimo.setNext(new Node(element, ultimo));
			ultimo = ultimo.getNext();
			size++;

		}
	}

	public void add(int index, Object element) {

		if (size == 0 || size == index) {

			add(element);
			
		} else if(index == 0){
			
			Node novo = new Node(element, primeiro);
			primeiro = novo;
			size++;
			
		} else if (size > 0 && size > index) {
			
			Node atual = primeiro;
			Node ult = null;
			
			for (int i = 1; i <= index; i++) {
				
				ult = atual;
				atual = atual.getNext();
				
			}
			
			ult.setNext(new Node(element, atual));
            size++;
			
		} else {
			System.err.println("Erro: posição da lista não foi alcançada ou é negativa");
		}

	}
	
	public void remove(int index) {
		
		if(index >= 0 && index < size) {
			
			Node atual = primeiro;
			Node ult = null;
			
			for (int i = 1; i <= index; i++) {
				ult = atual;
				atual = atual.getNext();
			}
			
			if(ult == null) {
				primeiro = atual.getNext();
				size--;
			}else {
				ult.setNext(atual.getNext());
				size--;
			}
			
			
		}else {
			System.err.println("Erro: o elemento ainda não existe na lista");
		}
		
	}
	
	public void removeAll() {
		
		primeiro = null;
		ultimo = null;
		size = 0;
		
	}
	
	public Object getElement(int index) {
		if(index >= 0 && index < size) {
			return posicao(index).getElement();
		}else {
			System.err.println("Erro: o elemento ainda não existe na lista");
			return null;
		}
	}
	
	public boolean contaim(Object element) {
		if(size != 0) {
			Node atual = primeiro;
			if(atual.equals(element)) {
				return true;
			}
			while(atual != null) {
				
				atual = atual.getNext();
				if(atual.equals(element)) {
					return true;
				}
				
			}
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public Node posicao(int index) {
		Node atual = primeiro; 
		for (int i = 1; i <= index; i++) {
			atual = atual.getNext();
		}
		return atual;
	}

}
