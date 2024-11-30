package programa.view;

import java.util.Locale;
import java.util.Scanner;
import entidades.CurrencyConverter;

public class Programa4 {

	public static void main(String[] args) {
		Scanner analised = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Qual o preço atual do dólar? ");
		double preco = analised.nextDouble();
		System.out.println("");
		System.out.print("Quantos dólares deseja comprar? ");
		double quantidade = analised.nextDouble();
		System.out.println("");
		System.out.printf("Preço total: R$%.2f.", CurrencyConverter.valorTotal(preco, quantidade));
		analised.close();
	}

}
