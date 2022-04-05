package main;

import java.util.Scanner;

public class MainCalculoPrimosLambda {

	@FunctionalInterface
	interface ComprobacionPrimo  {
		boolean comprobacionPrimo(int p);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================================================");
		System.out.println("Bienvenido al sistema de comprobaci�n de n�meros primos");
		System.out.println("=======================================================================");
		System.out.println("Introduzca el primer n�mero que quiera comprobar: ");
		int p1 = sc.nextInt();
		System.out.println("Introduzca el segundo n�mero que quiera comprobar: ");
		int p2 = sc.nextInt();
		System.out.println("Introduzca el tercer n�mero que quiera comprobar: ");
		int p3 = sc.nextInt();
		
		
		ComprobacionPrimo cp = p -> {
		boolean primo = true;
		if(p == 0 || p == 1 || p == 4) {
			primo = false;
			
		} else {
			
			for(int i = 2; i < p; i++) {
				
				if(p%i == 0 ) {
					primo = false;
					break;
				} else {
					continue;
				}
				
				
				
			}
		}
		
		System.out.println("El n�mero " + p + " es primo: " + primo);
		return primo;
	
	};
	
	Thread h1 = new Thread();
	Thread h2 = new Thread();
	Thread h3 = new Thread();
	

}

}