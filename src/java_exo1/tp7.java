package java_exo1;

/*
 * Ecrire un programme Java qui permet à l’utilisateur de définir une adresse email et un mot de passe.
Ensuite dans un second temps, il sera demandé à l’utilisateur de fournir l’email et le mot de passe:
Si l’email et le mot de passe ne correspondent pas aux valeurs définies, le message “Identifiants incorrect devra s’afficher”, et l’utilisateur devra recommencer la saisie des valeurs.
Sinon, le message “Bienvenu dans votre espace client” devra s’afficher.
Le nombre de fois que l’utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s’arrêter avec un message disant : “Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué“.
Il faut dire à au user le nombre de tentatives restants (modifié) 
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
