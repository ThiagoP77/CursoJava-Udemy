import java.util.Scanner;

public class EREF5 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		System.out.print("Insira o número desejado: ");
		int n = analise.nextInt();
		int fat = n;
		for (int f = 1; f < n; f++) {
			fat *= n-f;
		}
		System.out.println("Fatorial: "+fat+".");
		analise.close();

	}

}
