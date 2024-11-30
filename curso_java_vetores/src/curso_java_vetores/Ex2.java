package curso_java_vetores;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();
		double sum = 0;
		while (n<0) {
			System.out.printf("%nQuantos números você irá digitar? ");
			n = sc.nextInt();
		}
		double[] vet = new double[n];
		
		for (int f = 1; f <= vet.length; f++) {
			System.out.printf("%nInforme o %d número: ", f);
			vet[f-1] = sc.nextDouble();
			sum += vet[f-1];
		}
		
		double media = sum/vet.length;
		
		System.out.println("Resultados: ");
		System.out.printf("%nValores: ");
		for (int f = 0; f<vet.length; f++) {
			System.out.print(vet[f]+" ");
		}
		System.out.printf("%nSoma : %.2f.", sum);
		System.out.printf("%nMédia : %.2f.", media);
	}

}
