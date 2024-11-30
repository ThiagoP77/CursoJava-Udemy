import java.util.Scanner;
public class ESE4 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		Scanner analise2 = new Scanner (System.in);
		System.out.print("Informe o número do funcionário: ");
		int n = analise.nextInt();
		System.out.print("Informe quanto o funcionário ganha por hora: ");
		double gh = analise2.nextDouble();
		System.out.print("Informe quantas horas de trabalho: ");
		double h = analise2.nextDouble();
		double valor = gh*h;
		System.out.printf("Número do funcionário: %d.%n", n);
		System.out.printf("Valor recebido do mês: %.2f.", valor);
		analise.close();
		analise2.close();
	}

}
