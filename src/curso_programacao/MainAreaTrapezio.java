package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MainAreaTrapezio {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		double h = 0.0, b = 0.0, B = 0.0, area = 0.0; 
		
		System.out.print("b = "); 
		b = sc.nextDouble(); 
		System.out.print("B = "); 
		B = sc.nextDouble(); 
		System.out.print("h = "); 
		h = sc.nextDouble(); 
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		sc.close();
	}

}
