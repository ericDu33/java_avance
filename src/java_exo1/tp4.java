package java_exo1;

import java.util.Scanner;

public class tp4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value;
		System.out.print("Entrez votre nombre : ");
		value = scanner.nextInt();
		scanner.close();
		if ( value == 0 ) {
		    System.out.println("Le nombre est Zéro. Il est donc pair.");
		} else if ( value > 0 && value % 2 == 0  ) {
		    System.out.println("Le nombre est positif et pair.");
		} else if ( value < 0 && value % 2 == 0) {
		    System.out.println("Le nombre est négatif et pair.");
		} else if ( value > 0 && value/value != 0 ) {
		    System.out.println("Le nombre est positif et impair.");
		} else if ( value < 0 && value/value != 0 ) {
		    System.out.println("Le nombre est négatif et impair.");
		}		
	}
}
