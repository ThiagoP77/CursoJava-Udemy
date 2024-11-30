import java.util.Scanner;

public class ECE6 {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int n = analise.nextInt();
		System.out.println("");
		if(n>=0 && n<=25) {
			System.out.println("Número entre 0 e 25!");
		} else if(n>25 && n<=50) {
			System.out.println("Número entre 25 e 50!");
		} else if(n>50 && n<=75) {
			System.out.println("Número entre 50 e 75!");
		} else if(n>75 && n<=100) {
			System.out.println("Número entre 75 e 100!");
		} else {
			System.out.println("Número fora de intervalo!");
		}
		analise.close();

	}

}
