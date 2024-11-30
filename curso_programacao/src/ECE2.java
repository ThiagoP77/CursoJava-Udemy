import java.util.Scanner;

public class ECE2 {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int n = analise.nextInt();
		System.out.println("");
		if(n%2==0) {
			System.out.println("O número digitado é par!");
		} else {
			System.out.println("O número digitado é ímpar!");
		}
		analise.close();
	}

}
