package lista.linear.simplesmente.encadeada.exercicio1;



public class Test {

	public static void main(String[] args) {
	
        SLinkedList sll = new SLinkedList();
		
		sll.addCabeca("MSP");
		sll.addCabeca("LAX");
		sll.addCauda("ATL");
		sll.addCauda("BOS");
		sll.add("Latam", 0);

		for (int i = 0; i < sll.tamanho(); i++) {
			System.out.println(sll.getIndex(i));
		}
		
		if(sll.tamanho() != 5) {
			System.err.println("Erro: O tamanho da lista está errada");
		}
		
		sll.remove(1);
		
		if(sll.tamanho() != 4) {
			System.err.println("Erro: O tamanho está errado");
		}
		
		System.out.println();
		
		for (int i = 0; i < sll.tamanho(); i++) {
			System.out.println(sll.getIndex(i));
		}
		
		System.out.println("Contem o LAX: " + sll.contains("LAX"));
	}

}
