package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] matrice = new String[3][3];
		int nr, nc;
		int counter = 0;

		// inizializzazione matrice con spazi vuoti
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrice[i][j] = " ";
			}
		}
		do {
			System.out.println("Dove vuoi mettere la x?");
			nr = sc.nextInt();
			nc = sc.nextInt();
			if (!matrice[nr][nc].equalsIgnoreCase("x"))
				counter++;
			else
				System.out.println("La posizione è occupata!");
			matrice[nr][nc] = "x";
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matrice[i][j]);
				}
				System.out.println();
			}
		} while (counter < 9);
	}
}
