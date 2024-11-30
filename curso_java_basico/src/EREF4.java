import java.util.Scanner;

public class EREF4 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		Scanner analised = new Scanner (System.in);
		System.out.print("Informe quantos números serão digitados: ");
		int n = analise.nextInt();
		double n1;
		double n2;
		double divisão;
		while(n<=0) {
			System.out.println("");
			System.out.print("Informe quantos pares serão digitados: ");
			n = analise.nextInt();
		}
		for(int f = 0; f < n; f++) {
			System.out.printf("%nInforme o primeiro número: ");
			n1 = analised.nextDouble(); 
			System.out.printf("%nInforme o segundo número: ");
			n2 = analised.nextDouble();
			if (n2 == 0) {
				System.out.println("Divisão impossível!");
			} else {
				System.out.println("Resultado: "+(n1/n2)+".");
			}
		}
	}

}
