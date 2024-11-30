import java.util.Scanner;

public class ESE2 {

	public static void main(String[] args) {
		double pi = 3.14159;
		Scanner analise = new Scanner (System.in);
		System.out.print("Informe o raio da cincunferência: ");
		double raio = analise.nextDouble();
		double area = pi*(raio*raio);
		System.out.println("");
		System.out.printf("Área aproximada da cincunferência: %.4f.", area);

	}

}
