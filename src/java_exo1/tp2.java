package java_exo1;

/* Ecrire un programme Java qui demande à l'utilisateur de saisir 
 * son nom, prenom et age, et qui ensuite va afficher le message : 
 * "Vous vous appelez <prenom> <nom>, et vous avez <age> ans"
 */
import java.util.Scanner;

public class tp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom, prenom;
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quel est votre nom ? ");
		nom = scanner.next();		
		
		System.out.println("Quel est votre prénom ? ");
		prenom = scanner.next();		
		
		System.out.println("Quel est votre age ? ");
		age = scanner.nextInt();	
		
		System.out.println("Vous vous appelez "+prenom+" "+nom+", et vous avez "+age+" ans");
		
		
	}

}
