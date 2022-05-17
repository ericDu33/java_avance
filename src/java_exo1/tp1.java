package java_exo1;
	/* Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
	Surface = Rayon x Rayon x PI;
	Rayon = Diamètre / 2 */

import java.util.Scanner;
	
public class tp1 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("oui");
			
			int diametre;
			double surface;
			final double PI = 3.14;
			
			Scanner scanner = new Scanner(System.in);

			System.out.println("Quel est le diametre en cm ? ");
			diametre = scanner.nextInt();
			scanner.close();
			
			surface = 2 * PI * Math.pow((diametre/2),2);
			System.out.println("La surface du cercle est de "+surface+" cm²");
			
		}
}

