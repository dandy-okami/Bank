package bank;

import java.util.Scanner;

public class Comptes {
	private int numero;
	private int[] comptes;
	@SuppressWarnings("unused")
	private int nbc;
	private boolean entier;

	public Comptes(int n, int nbc) {
		numero = n;
		comptes = new int[nbc];

	}

	public int saisirUnCompte(Scanner sc) {
		while (entier == false) {
			try {
				String compte = sc.nextLine();
				int cpt = Integer.parseInt(compte);
				return cpt;
			} catch (NumberFormatException e) {
				System.err.println("erreur");
			}
		}
		return 0;
	}

	public void saisirCompte() {
		System.out.println("saisir les depot des differents comptes:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < comptes.length; i++) {
			comptes[i] = saisirUnCompte(sc);
		}
	}

	public void affiche() {
		System.out.println("Compte de numero:" + numero);
		for (int i = 0; i < comptes.length; i++) {
			System.out.print("compte n°:" + i + " " + comptes[i] + "|");
		}
		System.out.println("\n");
	}

	public void virement(Comptes CC, int montant) {

	}
}
