package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class DiaSemana {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		String diaSemana = ""; 
		
		switch(n) {
			case 1: 
				diaSemana = "Domingo";
				break;
			case 2: 
				diaSemana = "Segunda-Feira"; 
				break; 
			case 3: 
				diaSemana = "Terça-Feira"; 
				break; 
			case 4: 
				diaSemana = "Quarta-Feira"; 
				break;
			case 5: 
				diaSemana = "Quinta-Feira"; 
				break;
			case 6: 
				diaSemana = "Sexta-Feira"; 
				break;
			case 7: 
				diaSemana = "Sábado"; 
				break;
			default: 
				diaSemana = "Valor inválido"; 
		}
		System.out.printf("Dia da Semana: %s%n", diaSemana); 
		
		sc.close();
	}
}
