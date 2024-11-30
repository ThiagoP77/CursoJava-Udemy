package programa;
import java.util.Locale;
import java.util.Scanner;
import entidades.ContaB;

public class ProgramaB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double dp = 0;
		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		System.out.print("Informe o número da conta: ");
		int n = sc.nextInt();
		System.out.print("Informe o nome do dono da conta: ");
		String no = scs.nextLine();
		System.out.print("Deseja inserir um depósito inicial? (S/N)");
		String es = scs.nextLine();
		while(!es.equalsIgnoreCase("S")&&(!es.equalsIgnoreCase("N"))){
			System.out.print("%nDeseja inserir um depósito inicial? (S/N)");
			es = scs.nextLine();
		}
		
		if(es.equalsIgnoreCase("N")) {
			dp = 0;
		} else {
			System.out.print("Informe o valor do depósito inicial: ");
			dp = sc.nextDouble();
		}
		ContaB conta = new ContaB(n,no,dp);
		System.out.println(" ");
		
		System.out.println("Informações da conta: ");
		System.out.println(conta.mostrar());
		
		System.out.println(" ");
		System.out.print("Informe um valor de depósito: ");
		double d = sc.nextDouble();
		conta.deposito(d);
		
		System.out.println("Atualização da conta: ");
		System.out.println(conta.mostrar());
		
		System.out.println(" ");
		System.out.print("Informe um valor de saque: ");
		double s = sc.nextDouble();
		conta.saque(s);
		
		System.out.println("Atualização da conta: ");
		System.out.println(conta.mostrar());
	}

}
