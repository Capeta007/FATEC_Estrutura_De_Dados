package filas.exemplo.view;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import filas.exemplo.model.Funcionario;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Funcionario> waitingQueue = new LinkedList<>();

		waitingQueue.add(new Funcionario("Adriano", "38175", "Eletricista", 350.25));
		waitingQueue.add(new Funcionario("Leandro&Leonardo", "6723", "Carinha do Mouse", 100.00));
		waitingQueue.add(new Funcionario("Alicia", "111047", "Assistente do Adriano", 2.25));

		
//		for (Funcionario funcionario : waitingQueue) {
//			
//			System.out.println(funcionario);
//			
//		}
		
//		System.out.println(waitingQueue.remove());
		
//		System.out.println(waitingQueue.peek());

//		System.out.println("Fila vazia: " + waitingQueue.isEmpty());
//
//		System.out.println("Tamanho: " + waitingQueue.size());
//
//		System.out.println("Procurar elemento: " + waitingQueue.contains("Lucas"));
//
//		System.out.println("Elemento da frente: " + waitingQueue.element());
//
//		System.out.println(" | Nova Fila: " + waitingQueue);
//
//		System.out.println("Tamanho: " + waitingQueue.size());

//	    ArrayList<String> col = new ArrayList<>();
//	    
//	    col.add("Lucas");
//			
//		
////	    System.out.println(waitingQueue.peek());
//	    
//	    waitingQueue.removeAll(col);
//	    
//	    name = waitingQueue.poll();
//		System.out.println(" | Nova Fila: " + waitingQueue);
	}

}
