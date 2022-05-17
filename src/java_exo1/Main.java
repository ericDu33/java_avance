package java_exo1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("oui");
		
		int diametre;
		double surface;
		final double PI = 3.14;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quel est le diametre en cm ? ");
		diametre = scanner.nextInt();
		
		surface = 2 * PI * Math.pow((diametre/2),2);
		System.out.println("La surface du cercle est de "+surface+" cm²");
		
		
	}

}
