import java.util.Scanner;

public class ECE7 {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		String quadrante = null;
		System.out.print("Insira o x: ");
		double x = analise.nextDouble();
		System.out.print("Insira o y: ");
		double y = analise.nextDouble();
		System.out.println("");
		if(x == 0 && y!=0) {
			quadrante = "Eixo Y";
		} else if(y==0 && x!=0) {
			quadrante = "Eixo X";
		} else if (x==0 && y==0) {
			quadrante = "Origem";
		} else if (y>0 && x>0) {
			quadrante = "Q1";
		}  else if (y<0 && x>0) {
			quadrante = "Q4";
		} else if (y>0 && x<0) {
			quadrante = "Q2";
		} else if (y<0 && x<0) {
			quadrante = "Q3";
		}
		System.out.printf("Resultado: %s.", quadrante);
		analise.close();
	}
}
