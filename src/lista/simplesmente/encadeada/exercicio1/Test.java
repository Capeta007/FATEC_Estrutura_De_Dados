package lista.simplesmente.encadeada.exercicio1;

import lista.utilizando.referencia.Aluno;
import lista.utilizando.referencia.ListaLigada;

public class Test {

	public static void main(String[] args) {
	
        SLinkedList sll = new SLinkedList();
		
		sll.add("MSP");
		sll.add("LAX");
		sll.addCauda("ATL");
		sll.addCauda("BOS");

//		for (int i = 0; i < sll.tamanho(); i++) {
//			System.out.println(sll.getIndex(i).getElement());
//		}
		
		if(sll.tamanho() != 4) {
			System.err.println("Erro: O tamanho da lista está errada");
		}
		
		sll.remove(3);
		
		if(sll.tamanho() != 3) {
			System.err.println("Erro: O tamanho está errado");
		}
		
		for (int i = 0; i < sll.tamanho(); i++) {
			System.out.println(sll.getIndex(i));
		}
	}

}
