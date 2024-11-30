import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		char x;
		System.out.print("Insira uma letra: ");
		x = sc.next().charAt(0);
		
		System.out.printf("Letra digitado: %s.", x);
		
		sc.close();
	}

}
