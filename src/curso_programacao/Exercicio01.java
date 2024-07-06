package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		//Entrada
		double valorMetro = 0.0, area = 0.0, l = 0.0, c = 0.0, preco = 0.0; 
		l = sc.nextDouble(); 
		c = sc.nextDouble(); 
		valorMetro = sc.nextDouble(); 
		//Processamento 
		area = l * c; 
		preco = valorMetro * area; 
		//Saída 
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f", preco);
		
		sc.close();
	}

}
