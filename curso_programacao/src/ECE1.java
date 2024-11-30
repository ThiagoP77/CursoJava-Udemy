import java.util.Scanner;

public class ECE1 {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int n = analise.nextInt();
		System.out.println("");
		if(n>0) {
			System.out.println("O número digitado é positivo!");
		} else if (n==0) {
			System.out.println("O número digitado é nulo!");
		} else {
			System.out.println("O número digitado é negativo!");
		}
		analise.close();
	}

}
