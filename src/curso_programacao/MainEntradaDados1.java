package curso_programacao;

import java.util.Scanner;

public class MainEntradaDados1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		String s1, s2, s3; 
		int x; 
		x = sc.nextInt(); 
		sc.nextLine(); 
		s1 = sc.nextLine(); 
		s2 = sc.nextLine(); 
		s3 = sc.nextLine(); 
		
		System.out.printf("DADOS DIGITADOS:%n%s%n%s%n%s%n",s1, s2, s3);
		System.out.println(x); 
		sc.close();
	}

}
