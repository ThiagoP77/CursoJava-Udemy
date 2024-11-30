import java.util.Scanner;
public class ESE6 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		double pi = 3.14159;
		System.out.print("Informe o primeiro número: ");
		double a = analise.nextDouble();
		System.out.print("Informe o segundo número: ");
		double b = analise.nextDouble();
		System.out.print("Informe o terceiro número: ");
		double c = analise.nextDouble();
		double r1 = (a*c)/2;
		double r2 = pi*(c*c);
		double r3 = ((a+b)*c)/2;
		double r4 = b*b;
		double r5 = a*b;
		System.out.printf("Triângulo: %f.%n", r1);
		System.out.printf("Circulo: %f.%n", r2);
		System.out.printf("Trapézio: %f.%n", r3);
		System.out.printf("Quadrado: %f.%n", r4);
		System.out.printf("Retângulo: %f.%n", r5);

	}

}
