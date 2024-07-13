package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileMain {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		float celsius = 0f, f = 0f;
		Character repetir;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextFloat(); 
			f = (( 9 * celsius) / 5f) + 32f;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", f);
			System.out.print("Deseja repetir (s/n)? ");
			repetir = sc.next().charAt(0);
		}while(repetir == 's' || repetir == 'S'); 
		
		sc.close();
	}

}
