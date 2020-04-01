package lista.linear.simplesmente.encadeada.exercicio3;

import java.util.Arrays;

import lista.linear.simplesmente.encadeada.exercicio2.Aluno;

public class ListaSimplesEncadeada {

	private int MAX = 50;
	private Node[] lista;
	private int inicio;
	private int ultimo;
	private int size;

	public ListaSimplesEncadeada() {

		lista = new Node[MAX+1];
		int i;
		for (i = 0; i < MAX+1; i++) {

			lista[i] = new Node(null, i + 1);

		}
		inicio = 0;
		ultimo = 0;

	}

	public void add(Aluno newAluno) {
		
		    garantaEspaco();
			Node registrar = lista[inicio];

			while (registrar.getElement() != null) {

				ultimo = registrar.getNext();
				registrar = lista[registrar.getNext()];

			}

			registrar.setElement(newAluno);

			size++;
	}

	public void add(Aluno newAluno, int index) {

		if(index < size && index >= 0) {
			
		
		garantaEspaco();
		if (index != 0) {
			Node registrar = lista[inicio];
			Node ult = null;

			while (registrar.getElement() != null) {

				ult = registrar;
				ultimo = registrar.getNext();
				registrar = lista[registrar.getNext()];

			}

			registrar.setElement(newAluno);
			ult.setNext(registrar.getNext());

			int i = 0;
			Node posicao = lista[inicio];
			while (i < index - 1) {
				i++;
				posicao = lista[posicao.getNext()];
			}

			lista[ultimo].setNext(posicao.getNext());
			posicao.setNext(ultimo);
			size++;
		} else {
			Node registrar = lista[inicio];
			Node ult = null;

			while (registrar.getElement() != null) {

				ult = registrar;
				registrar = lista[registrar.getNext()];

			}

			int aux = registrar.getNext();
			registrar.setElement(newAluno);
			registrar.setNext(inicio);
			inicio = ult.getNext();
			ult.setNext(aux);
			size++;
		}
		}
	}

	public boolean remove(String index) {
		int i = 0;
		Node posicao = lista[inicio];
		Node ult = null;
		while (posicao.getElement().getNumMatricula() != index && posicao.getElement() != null ) {
			i++;
			ult = posicao;
			posicao = lista[posicao.getNext()];
		}

		if(posicao.getElement() != null) {
			if (i == ultimo) {
				posicao.setElement(null);
				size--;
			} else {
				posicao.setElement(null);

				int aux = posicao.getNext();

				posicao.setNext(lista[ultimo].getNext());

				lista[ultimo].setNext(aux);

				size--;
			}
			return true;
		}else {
			return false;
		}
	}

	public Aluno getElement(String nome) {

		Node busca = lista[inicio];
		Aluno aluno = busca.getElement();
		while (busca.getElement() != null) {

			if (aluno.getNumMatricula() == nome) {
				return aluno;
			}
			ultimo = busca.getNext();
			busca = lista[busca.getNext()];

		}

		return null;

	}

	public String imprimir() {

		Node registro = lista[inicio];
		String alunos = "";
		Aluno aluno = null;
		while (registro.getElement() != null) {

			aluno = registro.getElement();
			alunos += aluno.getNumMatricula() + " - " + aluno.getNome() + " P1: " + aluno.getNotap1() + " P2: "
					+ aluno.getNotap2() + " = " + aluno.calcMedia() + "\n";
			registro = lista[registro.getNext()];

		}

		return alunos;

	}

	public int size() {

		return size;

	}

	public void clear() {

		lista = new Node[MAX];
		int i;
		for (i = 0; i < MAX; i++) {

			lista[i] = new Node(null, i + 1);

		}
		inicio = 0;
		ultimo = 0;

	}
	
	public void garantaEspaco() {
		
		if(size() == MAX) {
		
			Node[] newlista = new Node[MAX+50];
			for (int i = 0; i < lista.length; i++) {
				newlista[i] = lista[i];
			}
			MAX = MAX+50;
			lista = newlista;
			System.out.println();
		}
	}

}
