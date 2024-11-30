package programa.view;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudante;

public class Programa3 {

	public static void main(String[] args) {
		double n, n1 = 0, n2 = 0, n3 =0;
		Scanner analised = new Scanner (System.in);
		Scanner analises = new Scanner (System.in);
		Estudante e = new Estudante();
		System.out.print("Insira o nome do aluno: ");
		String nome = analised.nextLine();
		Locale.setDefault(Locale.US);
		for (int f = 1; f<=3; f++) {
			System.out.printf("Insira a nota do %d° trimestre: ", f);
			n = analised.nextDouble();
			while(f == 1 && n > 30 || n < 0) {
				System.out.printf("Reinsira a nota do %d° trimestre: ", f);
				n = analised.nextDouble();
			}
			while(f !=1 && n > 35 || n < 0) {
				System.out.printf("Reinsira a nota do %d° trimestre: ", f);
				n = analised.nextDouble();
			}
			if (f==1) {
				n1 = n;
			} else if (f ==2) {
				n2 = n;
			} else {
				n3 = n;
			}
		}
		e.nota1 = n1;
		e.nota2 = n2;
		e.nota3 = n3;
		System.out.println("");
		System.out.printf("Média: %.2f.", e.media());
		System.out.println("");
		e.aprovacao();
		analised.close();
		

	}

}
