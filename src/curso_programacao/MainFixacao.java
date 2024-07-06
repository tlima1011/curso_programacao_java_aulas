package curso_programacao;

import java.util.Locale;

public class MainFixacao {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products: ");
		System.out.printf("%s, wich price $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price $ %.2f%n", product2, price2);
		System.out.printf("%n");
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("%n");
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal Point %.3f", measure);
	}
}
