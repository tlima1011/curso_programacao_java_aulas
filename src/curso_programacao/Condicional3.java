package curso_programacao;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) { 
			System.out.printf("MENOR A = %d",a);
		}
		else if(b < c && b < a) { 
			System.out.printf("MENOR B = %d",b);
		}else { 
			System.out.printf("MENOR C = %d",c);
		}
		sc.close();
	}
}
