import java.util.Scanner;

public class ECE3 {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		System.out.print("Insira o primeiro número: ");
		int n = analise.nextInt();
		System.out.print("Insira o segundo número: ");
		int nn = analise.nextInt();
		System.out.println("");
		if(n>=nn) {
			maior = n;
			menor = nn;
		} else if(nn>n) {
			maior = nn;
			menor = n;
		}
		
		if(maior%menor==0) {
			System.out.println("Os números são múltiplos!");
		} else {
			System.out.println("Os números não são múltiplos!");
		}
		analise.close();

	}

}
