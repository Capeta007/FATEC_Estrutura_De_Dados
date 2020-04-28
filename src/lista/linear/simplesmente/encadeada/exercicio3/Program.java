package lista.linear.simplesmente.encadeada.exercicio3;
public class Program {

	public static void main(String[] args) {
		
		ListaLigadaEstatica<Aluno> lle = new ListaLigadaEstatica<>();
		
		lle.add(new Aluno("leonardo", "1", 22, "ads", 3));
		lle.add(new Aluno("Ana", "1", 22, "ads", 3));
		lle.add(new Aluno("larissa", "1", 22, "ads", 3));
		lle.add(new Aluno("kelvin", "1", 22, "ads", 3));
		lle.add(1,new Aluno("wesley", "1", 22, "ads", 3));
		
		lle.imprimirLista();
		
		System.out.println();
		
		System.out.println(lle.getIndex(3));
		
	}

}