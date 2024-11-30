package teste_circunferencia;

import java.util.Scanner;

import entidades.Circulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Circulo calc = new Circulo();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		sc.close();
	}

}
