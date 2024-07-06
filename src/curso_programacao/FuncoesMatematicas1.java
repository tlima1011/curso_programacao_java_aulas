package curso_programacao;

public class FuncoesMatematicas1 {
	
	public static void main(String[] args) {
		
		double a, b, c, d; 
		a = 2.4; 
		b = 3; 
		c = -5.0;
		d = Math.E; 
		
		a = Math.log10(3); 
		System.out.printf("Log10(%.1f) = (%.1f)%n", b, a);
		b = Math.round(c); 
		c = Math.tan(a); 
		System.out.printf("Tangente de %.1f = %.1f%n", a,c);
		System.out.printf("Número de Euller %.4f%n", d);
		b = Math.sqrt(9); 
		System.out.printf("Raiz quadrada de 9 = %.0f", Math.sqrt(9));
		
		
	}
}
