import java.util.Scanner;
public class ESE3 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe o primeiro número: ");
		int a = analise.nextInt();
		System.out.print("Informe o segundo número: ");
		int b = analise.nextInt();
		System.out.print("Informe o terceiro número: ");
		int c = analise.nextInt();
		System.out.print("Informe o quarto número: ");
		int d = analise.nextInt();
		int resultado = ((a*b)-(c*d));
		System.out.println("");
		System.out.printf("O resultado é de: %d.", resultado);
		analise.close();
	}

}
