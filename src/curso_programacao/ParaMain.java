package curso_programacao;

import java.util.Scanner;

public class ParaMain {

	public static void main(String[] args) {
		
		/* for(inicio, condicao; incremento) {
		 * 		comando 1 
		 * 		comando 2
		 * 		comando 3 
		 * }
		 * 
		 */
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		int s = 0; 
		
		for(int i = 0; i < n; i++) { 
			int x = sc.nextInt(); 
			s += x; 
		}
	
		System.out.println(s);
		
		sc.close();
	}

}
