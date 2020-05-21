package grafos.exercicio2.view;

import java.util.Scanner;

public class Program {
	private static char[] vt = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r','s','t','u','v','w','x','y','z' };

	public static void main(String[] args) {

		int vert = obterNumVertices();

		int[][] mat = obterMatriz(vert);
		
		listaAdjacencias(mat);

		exibirMatriz(mat);

	}

	private static int[][] obterMatriz(int vert) {
		
		int[][] mat = new int[vert][vert];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(i != j) {
					mat[i][j] = 1;
				}
			}
		}
		
		return mat;
	}

	public static int obterNumVertices() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de vertices: ");
		int vert = sc.nextInt();

		sc.close();
		return vert;
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

	public static void listaAdjacencias(int[][] mat) {

		System.out.println();
		System.out.println("===Lista de Adjacencias===");

		for (int i = 0; i < mat.length; i++) {
			System.out.print("|" + vt[i] + "|");
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] > 0) {
					System.out.print(" -> |" + vt[j] + "|");
				}
			}
			System.out.println();
		}

	}
}
