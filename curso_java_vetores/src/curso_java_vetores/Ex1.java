package curso_java_vetores;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();
		while (n<0||n>10) {
			System.out.print("%nQuantos números você irá digitar? ");
			n = sc.nextInt();
		}
		int[] vet = new int[n];
		
		for (int f = 1; f <= vet.length; f++) {
			System.out.printf("%nInforme o %d número: ", f);
			vet[f-1] = sc.nextInt();
		}
		
		System.out.printf("%nNúmeros negativos digitados:");
		for (int f = 0; f < vet.length; f++) {
			if(vet[f]<0) {
				System.out.println(vet[f]);
			} else {
				
			}
		}
	}

}
