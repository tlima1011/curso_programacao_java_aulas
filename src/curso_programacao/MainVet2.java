package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MainVet2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		double vet[] = new double[n]; 
		double soma = 0.0, media = 0.0; 
		
		for(int i = 0; i < n; i++) { 
			vet[i] = sc.nextDouble(); 
			soma += vet[i]; 
		}
		
		media = soma / (double) n; 
		
		for(double vt : vet) { 
			System.out.printf("%.1f ", vt);
		}
		
		System.out.println(); 
		System.out.printf("%.2f%n",soma);
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}
}
