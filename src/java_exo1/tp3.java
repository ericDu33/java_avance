package java_exo1;

/* Ecrire un programme Java qui d�clare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
Exemple : 
Entrez la premi�re valeur(a) : 51
Entrez la deuxi�me valeur(b) : 876
Entrez la troisi�me valeur(c) : 235
Les valeurs entr�es sont : a = 51, b = 876 et c = 235
Permutation: b <== a, c <== b, a <== c
Les valeurs permut�es sont : a = 235, b = 51 et c = 876 */

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
