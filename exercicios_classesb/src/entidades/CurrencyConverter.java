package entidades;

public class CurrencyConverter {
	public static double taxa = 0.06;
	
	public static double valorTotal(double preco, double quantidade) {
		double valor = preco*quantidade;
		double valort = valor;
		valort += valor*taxa;
		return valort;
	}
}
