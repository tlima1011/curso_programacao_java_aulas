package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Repeticao2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double s = 0.0, m = 0.0; 
		int c = 0; 
		int idade = sc.nextInt(); 
		
		while (idade >= 0) {
			s += idade; 
			c = c + 1; 
			idade = sc.nextInt();
		}
		
		if(c > 0) { 
			m = s / (double) c;
			System.out.printf("%.2f%n", m);	
		}
		else {
			System.out.println("Impossivel calcular");
		}
		
		

		sc.close();
	}
}
