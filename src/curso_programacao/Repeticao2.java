package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Repeticao2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double s = 0.0, m = 0.0; 
		int c = 0; 
		int n = sc.nextInt(); 
		
		if(n < 0) { 
			System.out.println("Impossivel calcular");
		} 
		while (n != 0) {
			if (n < 0) {
				break;
			}
			s += n;
			n = sc.nextInt();
			c++;
		}
		m = s / (double) c;
		System.out.printf("%.2f%n", m);	

		sc.close();
	}
}
