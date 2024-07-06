package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		//Entrada 
		double base = sc.nextDouble(); 
		double altura = sc.nextDouble(); 
		//Processamento 		
		double area = base * altura; 
		double perimetro = 2 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(altura, 2.0) + Math.pow(base, 2.0)); 
		//Saída 
		System.out.printf("AREA = %.4f%n", area); 
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
	}

}
