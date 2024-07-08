package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploCondicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int diferenca = 0; 
		double valor = 50.0; 
		int minutos = sc.nextInt(); 
		
		if(minutos > 100) { 
			diferenca = minutos - 100; 
			valor += (diferenca * 2.0); 
		}
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		sc.close();
	}
}
