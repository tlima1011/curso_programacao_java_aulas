package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MainVet3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		double soma = 0.0, media = 0.0; 
		int c = 0; 
		int n = sc.nextInt(); 
		
		String nome[] = new String[n]; 
		int idade[] = new int[n]; 
		double altura[] = new double[n]; 
		
		for(int i = 0; i < n;i++) { 
			nome[i] = sc.next(); 
			idade[i] = sc.nextInt(); 
			altura[i] = sc.nextDouble(); 
			soma += altura[i]; 
		}
		
		for(int i = 0; i < n;i++) { 
			if(idade[i] < 16) { 
				c++;
			}
		}
		
		double x = (c * 100) / (double) n;
		media = soma / (double) n; 
		
		System.out.printf("Altura média: %.2f%n", media);  
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", x); 
		
		sc.close();
		

	}

}
