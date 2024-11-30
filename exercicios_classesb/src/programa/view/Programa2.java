package programa.view;

import java.util.Scanner;
import entidades.Funcionario;;

public class Programa2 {

	public static void main(String[] args) {
		Scanner analises = new Scanner (System.in);
		Scanner analised = new Scanner (System.in);
		Funcionario f = new Funcionario();
		System.out.print("Informe o nome do funcionário: ");
		String nome = analises.nextLine();
		System.out.print("Informe o salário bruto do funcionário: ");
		double sb = analised.nextDouble();
		System.out.print("Informe a taxa sobre o funcionário: ");
		double taxa = analised.nextDouble();
		f.nome = nome;
		f.salarioB = sb;
		f.taxa = taxa;
		System.out.println("");
		System.out.println(f.toString());
		System.out.print("Aumentar o salário na porcentagem: ");
		double p = analised.nextDouble();
		f.increaseSalary(p);
		System.out.println("");
		System.out.println("");
		System.out.println(f);
	}

}
