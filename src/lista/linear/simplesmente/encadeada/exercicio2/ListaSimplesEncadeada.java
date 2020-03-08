package lista.linear.simplesmente.encadeada.exercicio2;



public class ListaSimplesEncadeada {

	private Node primeiro;
	private Node ultimo;
	private int size;

	public ListaSimplesEncadeada() {

		size =0;
		
	}

	public void add(Object element) {

		if (size == 0) {

			primeiro = new Node(element, null);
			ultimo = primeiro;
			size++;

		} else {

			
			ultimo.setNext(new Node(element, null));
			size++;

		}
	}

	public void add(int index, Object element) {

		if (size == 0 || size == index) {

			add(element);
			size++;
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
	
	public boolean remove(String num) {
		num = num.trim();
		Node atual = primeiro;
		Node ult = null;
		Aluno aluno;
		while(atual != null) {
			aluno = (Aluno) atual.getElement();
			if(aluno.getNumMatricula().trim().equals(num)) {
 
				if(ult == null) {
					primeiro = atual.getNext();
					return true;
				}else {
					ult.setNext(atual.getNext());
					return true;
				}
				
				
			}
			ult = atual;
			atual = atual.getNext();
		}
		return false;
	}
	
	public void clear() {
		
		primeiro = null;
		ultimo = null;
		size = 0;
		
	}
	
	public Aluno getElement(String num) {
		num = num.trim();
		Node atual = primeiro;
		Aluno aluno;
		while(atual != null) {
			aluno = (Aluno) atual.getElement();
			if(aluno.getNumMatricula().trim().equals(num)) {
                return aluno;
			}
			atual = atual.getNext();
			
		}
		return null;
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
	
	public String imprimir() {
		
		if(size > 0) {
			String alunos = "";
			Node atual = primeiro;
			Aluno aluno;
			while(atual != null) {
				aluno = (Aluno) atual.getElement();
				alunos += aluno.getNumMatricula() + " - " + aluno.getNome() + " P1: " + aluno.getNotap1() + " P2: " + aluno.getNotap2() + " = " + aluno.calcMedia() + "\n";
				atual = atual.getNext();
				
			}
			
			
			return alunos;
		}
		
		return null;
		
	}
	

}
