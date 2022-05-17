package java_exo1;

/* Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
Exemple : 
Entrez la première valeur(a) : 51
Entrez la deuxième valeur(b) : 876
Entrez la troisième valeur(c) : 235
Les valeurs entrées sont : a = 51, b = 876 et c = 235
Permutation: b <== a, c <== b, a <== c
Les valeurs permutées sont : a = 235, b = 51 et c = 876 */

import java.util.Scanner;

public class tp3 {

	public static void main(String[] args) {
	int a,b,c,d;
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("a ?");
	a = scanner.nextInt();		
	
	System.out.println("b ?");
	b = scanner.nextInt();		
	
	System.out.println("c ?");
	c = scanner.nextInt();		
	
	d=b;
	b=a;
	a=d;
	
	System.out.println("a = "+a+". b = "+b+". c = "+c);
	
	}}
