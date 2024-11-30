import java.util.Scanner;

public class EREF1 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe o número entre 1 e 1000: ");
		int x = analise.nextInt();
		while(x<1 || x>1000) {
			System.out.println(" ");
			System.out.print("Informe o número entre 1 e 1000: ");
			x = analise.nextInt();
		}
		for(int f = 0; f<=x; f++) {
			if(f%2!=0) {
				System.out.println(f);
			} else {
				
			}
		}
		analise.close();

	}

}
