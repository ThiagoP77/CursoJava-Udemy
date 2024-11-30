import java.util.Scanner;

public class EREF2 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe quantos números serão digitados: ");
		int n = analise.nextInt();
		int n1;
		int in = 0;
		int out = 0;
		while(n<=0) {
			System.out.println("");
			System.out.print("Informe quantos números serão digitados: ");
			n = analise.nextInt();
		}
		for(int f = 0; f<n; f++) {
			System.out.printf("%nInforme o número: ");
			n1 = analise.nextInt();
			if(n1>=10 && n1<=20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.printf("%n%d in.", in);
		System.out.printf("%n%d out.", out);
		analise.close();
	}

}
