import java.util.Scanner;

public class EREF6 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe o número: ");
		int n = analise.nextInt();
		System.out.println("");
		System.out.println("Lista de Divisores:");
		for (int f = 1; f<=n; f++) {
			if(n%f==0) {
				System.out.println(f);
			} else {
				
			}
		}
		
		
		analise.close();

	}

}
