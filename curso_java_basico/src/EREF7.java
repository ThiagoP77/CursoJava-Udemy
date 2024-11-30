import java.util.Scanner;

public class EREF7 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe o número: ");
		int n = analise.nextInt();
		int l;
		int q;
		int c;
		System.out.println("");
		System.out.println("Lista:");
		for(int f = 1; f<=n; f++) {
			l = f;
			q = l*l;
			c = l*q;
			System.out.printf("%n%d %d %d", l, q, c);
		}
		
		analise.close();

	}

}
