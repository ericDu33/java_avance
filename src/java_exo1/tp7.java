package java_exo1;

/*
 * Ecrire un programme Java qui permet � l�utilisateur de d�finir une adresse email et un mot de passe.
Ensuite dans un second temps, il sera demand� � l�utilisateur de fournir l�email et le mot de passe:
Si l�email et le mot de passe ne correspondent pas aux valeurs d�finies, le message �Identifiants incorrect devra s�afficher�, et l�utilisateur devra recommencer la saisie des valeurs.
Sinon, le message �Bienvenu dans votre espace client� devra s�afficher.
Le nombre de fois que l�utilisateur peut saisir des mauvais identifiants est limit� � 5, ensuite le programme va s�arr�ter avec un message disant : �Vous avez saisi des mauvais identifiants x fois, votre compte est bloqu�.
Il faut dire � au user le nombre de tentatives restants (modifi�) 
 */

import java.util.Scanner;


public class tp7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String email = "leCrack@jupiter.fr";
		String pass = "JeSuisLeRoi";
		
		String sEmail, sPass;
		int nbErreur = 0;
		
		System.out.print("Entrez votre Email : ");
		sEmail = scanner.next();

		System.out.print("Entrez votre mot de passe : ");
		sPass = scanner.next();

		if ((email==sEmail)) {// || !(sPass==pass)) {
			nbErreur++;
		}
		
		System.out.println(email);

		System.out.println(sEmail);
		System.out.print(nbErreur);
	}

	
}
