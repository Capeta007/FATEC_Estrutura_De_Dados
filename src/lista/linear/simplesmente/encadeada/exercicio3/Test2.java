package lista.linear.simplesmente.encadeada.exercicio3;import com.sun.glass.ui.Size;

import lista.linear.simplesmente.encadeada.exercicio2.Aluno;

public class Test2 {

	public static void main(String[] args) {
		
		ListaSimplesEncadeada lse = new ListaSimplesEncadeada();
		
		lse.add(new Aluno("1", "Leonardo", "ads", 1, 2, 3, 4));
		lse.add(new Aluno("2", "Leonardo", "ads", 1, 2, 3, 4));
		lse.add(new Aluno("3", "Leonardo", "ads", 1, 2, 3, 4));
		lse.add(new Aluno("4", "Leonardo", "ads", 1, 2, 3, 4));
		
		lse.add(new Aluno("6", "Doido", "ads", 1, 2, 3, 4), 0);

//		lse.imprimir();
		
		lse.remove("2");
		
		lse.add(new Aluno("7", "Doido", "ads", 1, 2, 3, 4));
		lse.add(new Aluno("8", "Doido", "ads", 1, 2, 3, 4));
		
		System.out.println();
		
		lse.imprimir();
		
		for(int i = 0; i<43; i++) {
			lse.add(new Aluno("4", "Leonardo", "ads", 1, 2, 3, 4));
		}
		
		System.out.println();
		
		System.out.println(lse.imprimir());
		System.out.println(lse.size());
		
		lse.garantaEspaco();
	}

}
