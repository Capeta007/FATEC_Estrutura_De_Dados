package grafos.exercicio3.view;

//Exercicio 3 - Escreva um programa que receba como entrada uma matriz de adjacências de um grafo simples, ponderado e conexo e escreva como saída as arestas (na forma de pares ordenadose dê seus pesos).

import java.util.Scanner;

public class Program {

	private static char[] vt = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n','o','p','q' };

	public static void main(String[] args) {

		int[][] mat = obterMatrizPonderada();

		arestaGrafo(mat);

		exibirMatriz(mat);

	}

	public static int[][] obterMatrizPonderada() {

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

	private static void arestaGrafo(int[][] mat) {

		System.out.println();
		System.out.print("===Arestas do Grafo e seu Peso=== \n\n");

		System.out.println("|u" + " - " + "v = p|");
		System.out.println("|---------|");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] > 0) {
					System.out.println("|" + vt[i] + " - " + vt[j] + " = " + mat[i][j] + "|");
				}
			}
		}

	}

	public static void exibirMatriz(int[][] mat) {

		System.out.println();
		System.out.println("===Matriz de Adjacencias===");
		System.out.println();

		System.out.print(" ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print("  " + vt[i]);
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
}
