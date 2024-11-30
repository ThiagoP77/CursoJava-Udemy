package curso_java_vetores;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		String nome;
		double altura;
		int idade;
		double mediaA = 0;
		int menor = 0;
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		Scanner scd = new Scanner(System.in);
		System.out.print("Quantas pessoas você irá inserir? ");
		int n = scn.nextInt();
		while (n<0) {
			System.out.printf("%nQuantas pessoas você irá inserir? ");
			n = scn.nextInt();
		}
		
		String[] nomes = new String[n];
		double[] alturas = new double[n];
		int[] idades = new int[n];
		
		for (int f = 1; f <= n; f++) {
			System.out.printf("Informe o nome da %d pessoa: ", f);
			nomes[f-1] = sc.nextLine();
			System.out.printf("Informe a idade da %d pessoa: ", f);
			idades[f-1] = scn.nextInt();
			System.out.printf("Informe a idade da %d pessoa: ", f);
			alturas[f-1] = scd.nextDouble();
			mediaA += alturas[f-1];
			if(idades[f-1]<16) {
				menor += 1;
			}
		}
		
		double porcent = 100*menor/idades.length;
		mediaA = mediaA/alturas.length;
		
	    System.out.println("Média das alturas:"+mediaA+".");
	    System.out.println("Porcentagem com menos de 16 anos: "+porcent+".");
	    for(int f = 0; f < idades.length; f++) {
	    	if(idades[f]<16) {
	    		System.out.println(nomes[f]);
	    	}
	    }
		
	}

}
