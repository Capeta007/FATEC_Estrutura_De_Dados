package lista.simplesmente.encadeada.exercicio2;

public class Test {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("1", "Cachorro", "ads", 5, 5, 10, 5);
		Aluno a2 = new Aluno("2", "Gato", "ads", 3, 3, 0, 0);
		Aluno a3 = new Aluno("3", "João", "ads", 10, 10, 2, 2);
		
		ListaSimplesEncadeada lse = new ListaSimplesEncadeada();
		
		lse.add(a1);
		lse.add(a2);
		lse.add(0,a3);
		
		System.out.println(lse.size());

		System.out.println(lse.getElement(0));
		System.out.println(lse.getElement(1));
		System.out.println(lse.getElement(2));
		
	}

}
