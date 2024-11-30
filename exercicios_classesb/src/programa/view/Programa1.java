package programa.view;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa1 {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
		Retangulo r = new Retangulo();
		System.out.print("Informe a altura do retângulo: ");
		double a = analise.nextDouble();
		System.out.print("Informe a largura do retângulo: ");
		double l = analise.nextDouble();
		System.out.println("");
		r.altura = a;
		r.largura = l;
		System.out.println("Área: "+r.area()+".");
		System.out.println("Perimetro: "+r.perimetro()+".");
		System.out.println("Diagonal: "+r.diagonal()+".");
		analise.close();
	}

}
