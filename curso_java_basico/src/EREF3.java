import java.util.Scanner;

public class EREF3 {

	public static void main(String[] args) {
		Scanner analisei = new Scanner (System.in);
		Scanner analised = new Scanner (System.in);
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		double n1;
		double n2;
		double n3;
		double media;
		System.out.print("Informe a quantidade de casos: ");
		int n = analisei.nextInt();
		while(n<=0) {
			System.out.println("");
			System.out.print("Informe a quantidade de casos: ");
			n = analisei.nextInt();
		}
        for (int f = 0; f < n; f++) {
        	System.out.println("");
        	System.out.print("Informe o primeiro valor: ");
        	n1 = analised.nextDouble();
        	System.out.printf("%nInforme o segundo valor: ");
        	n2 = analised.nextDouble();
        	System.out.printf("%nInforme o terceiro valor: ");
        	n3 = analised.nextDouble();
        	media = ((n1*peso1)+(n2*peso2)+(n3*peso3))/10;
        	System.out.printf("%nMédia %d: %.1f.%n", (f+1), media);
        }
        analisei.close();
        analised.close();
	}

}
