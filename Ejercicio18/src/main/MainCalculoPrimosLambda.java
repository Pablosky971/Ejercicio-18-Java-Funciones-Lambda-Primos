package main;

import java.util.Scanner;

public class MainCalculoPrimosLambda {

	@FunctionalInterface
	interface ComprobacionPrimo  {
		Runnable comprobacionPrimo(int p);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================================================");
		System.out.println("Bienvenido al sistema de comprobación de números primos");
		System.out.println("=======================================================================");
		System.out.println("Introduzca el primer número que quiera comprobar: ");
		int p1 = sc.nextInt();
		System.out.println("Introduzca el segundo número que quiera comprobar: ");
		int p2 = sc.nextInt();
		System.out.println("Introduzca el tercer número que quiera comprobar: ");
		int p3 = sc.nextInt();
		
		
		ComprobacionPrimo cp = p -> {
		
		if(p == 0 || p == 1 || p == 4) {
			System.out.println("El número " + p + " no es primo, sino compuesto.");;
			
		} else {
			
			for(int i = 2; i < p; i++) {
				
				if(p%i == 0 ) {
					System.out.println("El número " + p + " no es primo, sino compuesto.");;
					break;
				} else {
					if(i == p-1) {
						System.out.println("El número " + p + " es primo.");
					} else {
						continue;
					}
				}
				 
				
			}
		}
		
		
		return null;
		
	
	};
	
	Thread h1 = new Thread(cp.comprobacionPrimo(p1));
	Thread h2 = new Thread(cp.comprobacionPrimo(p2));
	Thread h3 = new Thread(cp.comprobacionPrimo(p3));
	
	
	// Probamos:
	
	h1.start();
	h2.start();
	h3.start();

}

}