import java.util.Scanner;

public class ECE5 {
	
	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		double preco = 0;
		System.out.print("Insira o código: ");
		int n = analise.nextInt();
		while (n != 1 && n != 2 && n != 3 && n!=4 && n!=5) {
			System.out.print("Insira o código: ");
			n = analise.nextInt();
		}
		if (n ==1) {
			preco = 4.00;
		} else if(n==2) {
			preco = 4.50;
		} else if (n ==3) {
			preco = 5.00;
		} else if (n ==4) {
			preco = 2.00;
		} else if (n==5) {
			preco = 1.50;
		}
		System.out.print("Insira a quantidade: ");
		int nn = analise.nextInt();
		while (nn<0) {
			System.out.print("Insira a quantidade: ");
			nn = analise.nextInt();
		}
		double valor = (double) nn*preco;
		System.out.println("");
		System.out.printf("Valor total: %.2f.", valor);
	}
}
