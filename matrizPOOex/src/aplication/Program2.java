package aplication;

import java.util.Random;

public class Program2 {
	public static void preencher(int[] vetor) {
		int i;
		Random random = new Random();
		for (i = 0; i < 10; i++) {
			vetor[i] = random.nextInt(30);
		}
	}

	public static void imprimir(int[] vetor) {
		int i;
		for (i = 0; i < 10; i++) {
			System.out.print(vetor[i]);
			System.out.print("|");
		}
		System.out.println("");

	}

	public static void ordenardecresc(int[] vetor) {
		int l, j;
		int temp = 0;
		for (l = 0; l < vetor.length; l++) {
			for (j = 0; j < l; j++) {

				if (vetor[l] > vetor[j]) {
					temp = vetor[l];
					vetor[l] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] vetor = new int[10];
		preencher(vetor);
		imprimir(vetor);
		System.out.println("");
		System.out.println("Agora vamos ordenar o vetor em ordem decrescente");
		System.out.println("");
		ordenardecresc(vetor);
		imprimir(vetor);
	}

}
