import java.util.Scanner;

public class Funcoes1 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		int a;
		int b;
		int c;
		System.out.print("Informe o primeiro número: ");
		a = analise.nextInt();
		System.out.println("");
		System.out.print("Informe o segundo número: ");
		b = analise.nextInt();
		System.out.println("");
		System.out.print("Informe o terceiro número: ");
		c = analise.nextInt();
		
		int maior = max(a,b,c);
		showResult(maior);
	}
	
	public static int max(int a, int b, int c) {
		int max;
		if(a > b && a > c) {
			max = a;
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}
	
	public static void showResult(int maior) {
		System.out.println("");
		System.out.println("Maior número: "+maior+".");
	}
}
