package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] matrice = new String[3][3];
		int nr, nc;
		int counter = 0;
		boolean mossaG1, mossaG2;
		String chiVince = "nessuno";
		// inizializzazione matrice con spazi vuoti
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrice[i][j] = " ";
			}
		}
		do {
			do {// mossa gioc1
				mossaG1 = false;
				System.out.println("Dove vuoi mettere la x?");
				nr = sc.nextInt();
				nc = sc.nextInt();
				if (nr<3 && nc<3) {
				if (matrice[nr][nc].equalsIgnoreCase(" ")) {
					matrice[nr][nc] = "x";
					mossaG1 = true;
					counter++;
				} else
					System.out.println("La posizione è occupata!");
				} else 
					System.out.println("Mossa non valida!!");
				} while (!mossaG1);

			for (int i = 0; i < 3; i++) {// stampa griglia
				for (int j = 0; j < 3; j++) {
					System.out.print(matrice[i][j]);
				}
				System.out.println();
			}
			for (int i = 0; i < 3; i++) {// condizione vittoria verticale
				if (matrice[i][0].equals(matrice[i][1]) && matrice[i][0].equals(matrice[i][2])
						&& matrice[i][0].equals("x"))
					chiVince = ("giocatore 1");
			}
			for (int j = 0; j < 3; j++) {// condizione vittoria orizzontale
				if (matrice[0][j].equals(matrice[1][j]) && matrice[0][j].equals(matrice[2][j])
						&& matrice[0][j].equals("x"))
					chiVince = ("giocatore 1");
			}
			if (matrice[0][0].equals(matrice[1][1]) && matrice[0][0].equals(matrice[2][2]) && matrice[0][0].equals("x"))// condizioni diagonali
				chiVince = ("giocatore 1");
			if (matrice[2][0].equals(matrice[1][1]) && matrice[2][0].equals(matrice[0][2]) && matrice[2][0].equals("x"))// condizioni diagonali
				chiVince = ("giocatore 1");

			if (chiVince.equals("giocatore 1") || counter == 9)
				break;
			do { // mossa gioc2
				mossaG2 = false;
				System.out.println("Dove vuoi mettere lo 0?");
				nr = sc.nextInt();
				nc = sc.nextInt();
				if (nr<3 && nc<3) {
				if (matrice[nr][nc].equalsIgnoreCase(" ")) {
					matrice[nr][nc] = "0";
					mossaG2 = true;
					counter++;
				} else
					System.out.println("La posizione è occupata!");
			}
				else 
					System.out.println("Mossa non valida!!");
			}while (!mossaG2);

			for (int i = 0; i < 3; i++) {// stampa griglia
				for (int j = 0; j < 3; j++) {
					System.out.print(matrice[i][j]);
				}
				System.out.println();
			}
			for (int i = 0; i < 3; i++) {// condizione vittoria verticale
				if (matrice[i][0].equals(matrice[i][1]) && matrice[i][2].equals(matrice[i][1])
						&& matrice[i][0].equals("0"))
					chiVince = ("giocatore 2");
			}
			for (int j = 0; j < 3; j++) {// condizione vittoria orizzontale
				if (matrice[0][j].equals(matrice[1][j]) && matrice[2][j].equals(matrice[1][j])
						&& matrice[0][j].equals("0"))
					chiVince = ("giocatore 2");
			}

			if (matrice[0][0].equals(matrice[1][1]) && matrice[0][0].equals(matrice[2][2]) && matrice[0][0].equals("0"))// condizioni diagonali
				chiVince = ("giocatore 2");
			if (matrice[2][0].equals(matrice[1][1]) && matrice[2][0].equals(matrice[0][2]) && matrice[2][0].equals("0"))//condizioni diagonalley
				chiVince = ("giocatore 2");

		} while (!chiVince.equals("giocatore 1") && !chiVince.equals("giocatore 2"));
		if (counter == 9)
			System.out.println("Pareggio!!");
		else
			System.out.println("Vince il " + chiVince);
	}
}
/*
 * counter che va da totale navi a zero mettere tilde come acqua mostrare utente
 * dove colpisce
 * 
 */