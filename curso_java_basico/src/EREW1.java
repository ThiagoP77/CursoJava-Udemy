import java.util.Scanner;

public class EREW1 {

	public static void main(String[] args) {
		int senhac = 2002;
		int senhai;
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe a senha: ");
		senhai = analise.nextInt();
		while (senhai!=senhac) {
			System.out.printf("%nSenha inválida!%n");
			System.out.print("Informe a senha: ");
			senhai = analise.nextInt();
		}
		System.out.printf("%nAcesso Permitido!");
		analise.close();
	}

}
