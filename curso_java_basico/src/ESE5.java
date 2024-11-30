import java.util.Scanner;
public class ESE5 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		Scanner analise2 = new Scanner (System.in);
		System.out.print("Informe o código da primeira peça: ");
		int c1 = analise.nextInt();
		System.out.print("Informe a quantidade vendida: ");
		int q1 = analise.nextInt();
		System.out.print("Informe o preço: ");
		double p1 = analise2.nextDouble();
		System.out.println(" ");
		System.out.print("Informe o código da segunda peça: ");
		int c2 = analise.nextInt();
		System.out.print("Informe a quantidade vendida: ");
		int q2 = analise.nextInt();
		System.out.print("Informe o preço: ");
		double p2 = analise2.nextDouble();
		double total1 = (double) q1*p1;
		double total2 = (double) q2*p2;
		double total = total1+total2;
		System.out.println(" ");
		System.out.printf("Valor vendido da peça %d: %.2f.%n", c1, total1);
		System.out.printf("Valor vendido da peça %d: %.2f.%n", c2, total2);
		System.out.printf("Valor total vendido: %.2f.", total);
		analise.close();
		analise2.close();

	}

}
