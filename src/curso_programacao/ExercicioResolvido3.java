package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		//Entrada 
		String nome1 = ler.next(); 
		int idade1 = ler.nextInt(); 
		String nome2 = ler.next(); 
		int idade2 = ler.nextInt(); 
		//Processamento 
		double media = (idade1 + idade2) / 2.0; 
		//Saída 
		System.out.printf( "A idade média de %s e %s é de %.1f anos.", nome1, nome2, media); 	
		ler.close();
	}
}
