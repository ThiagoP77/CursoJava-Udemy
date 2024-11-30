import java.util.Scanner;

public class EREW2 {

	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		String quadrante = null;
		System.out.print("Insira o x: ");
		double x = analise.nextDouble();
		System.out.print("Insira o y: ");
		double y = analise.nextDouble();
		if (y>0 && x>0) {
			quadrante = "Q1";
		}  else if (y<0 && x>0) {
			quadrante = "Q4";
		} else if (y>0 && x<0) {
			quadrante = "Q2";
		} else if (y<0 && x<0) {
			quadrante = "Q3";
		}
		if (x!=0 && y!=0) {
			System.out.printf("%nResultado: %s.%n", quadrante);
		}
		while (x!=0 && y!=0) {
			System.out.print("Insira o x: ");
			x = analise.nextDouble();
			System.out.print("Insira o y: ");
			y = analise.nextDouble();
			System.out.println("");
			if (y>0 && x>0) {
				quadrante = "Q1";
			}  else if (y<0 && x>0) {
				quadrante = "Q4";
			} else if (y>0 && x<0) {
				quadrante = "Q2";
			} else if (y<0 && x<0) {
				quadrante = "Q3";
			}
			if (x!=0 && y!=0) {
				System.out.printf("%nResultado: %s.%n", quadrante);
			}
			
		}
		
		analise.close();

	}

}
