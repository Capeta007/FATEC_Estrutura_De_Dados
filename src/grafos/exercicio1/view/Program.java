package grafos.exercicio1.view;

//Exercicio 1 - Escreva um programa para ler como entrada uma matriz de adjacências de um grafo e responder as seguintes perguntas?
//a)Quais são as arestas do grafo?
//b)É um dígrafo ou um grafo não-direcionado?
//c)Qual é o grau de cada vértice?
//d)Qual é a lista de adjacências do mesmo grafo?

import java.util.Scanner;

public class Program {
	
	private static char[] vt = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n','o','p','q' };

	public static void main(String[] args) {

		int[][] mat = obterMatriz();

		arestaGrafo(mat);

		verificarTipo(mat);

		obterGraus(mat);
		
		listaAdjacencias(mat);

		exibirMatriz(mat);

	}

	private static int verificarTipo(int[][] mat) {

		System.out.println();
		System.out.print("===Arestas do Grafo=== \n\n");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] != mat[j][i]) {
					System.out.println("O grafo é um digrafo!!");
					return 0;
				}
			}
		}
		System.out.println("O grafo é não-direcionado!!");
		return 0;
	}

	private static void arestaGrafo(int[][] mat) {

		System.out.println();
		System.out.print("===Arestas do Grafo=== \n\n");

		System.out.println("|u" + " - " + "v|");
		System.out.println("|-----|");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				int cont = mat[i][j];
				while (cont > 0) {
					System.out.println("|"+vt[i] + " - " + vt[j]+ "|");
					cont--;
				}
			}
		}

	}

	public static int[][] obterMatriz() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de colunas da matriz: ");
		int size = sc.nextInt();

		int[][] mat = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("Digite o valor da linha " + i + " coluna " + j + ": ");
				mat[i][j] = sc.nextInt();
			}
		}

		sc.close();
		return mat;
	}

	private static void obterGraus(int[][] mat) {

		System.out.println();
		System.out.print("===Graus dos Vertices=== \n\n");

		int grau = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				grau = grau + mat[i][j];

			}
			System.out.println(vt[i] + " = " + grau);
			grau = 0;
		}

	}

	public static void exibirMatriz(int[][] mat) {

		System.out.println();
		System.out.println("===Matriz de Adjacencias===");
		System.out.println();

		System.out.print(" ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print("  " + vt[i] );
		}
		
		System.out.println();
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print(vt[i] + "|");
			for (int j = 0; j < mat.length; j++) {
				System.out.print(" " + mat[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}

	}

	public static void listaAdjacencias(int[][] mat) {

		System.out.println();
		System.out.println("===Lista de Adjacencias===");
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print("|" + vt[i] + "|");
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j] > 0) {
					System.out.print(" -> |" + vt[j] + "|");
				}
			}
			System.out.println();
		}

	}
}
