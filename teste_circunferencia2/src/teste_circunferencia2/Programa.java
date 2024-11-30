package teste_circunferencia2;

import java.util.Scanner;

import entidades.Calculadora;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculadora.circumference(radius);
		double v = Calculadora.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculadora.PI);

	}

}
