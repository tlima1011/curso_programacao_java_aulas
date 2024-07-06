package curso_programacao;

import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		//int y = 32; 
		
		double x = 10.35784; 
		System.out.println(x); 
		System.out.printf("%.2f%n", x); 
		System.out.printf("%.4f%n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.1f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n",x);
		System.out.printf("RESULTADO = %.3f metros%n",x);
		
	}
}
