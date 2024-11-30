import java.util.Scanner;

public class ESE1 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe o primeiro número: ");
		int x = analise.nextInt();
		System.out.print("Informe o segundo número: ");
		int y = analise.nextInt();
		System.out.println("");
		System.out.printf("%nA soma dos números digitados é: %d.", (x+y));
		analise.close();
	}

}
