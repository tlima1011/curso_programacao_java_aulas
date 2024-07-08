package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploCondicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		double valor = 50.0; 
		int minutos = sc.nextInt(); 
		
		valor = (minutos > 100) ? valor += (minutos - 100) * 2.0 : 50.00; 
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		sc.close();
	}
}
