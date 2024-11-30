import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner analise = new Scanner (System.in);
        System.out.print("Quantas horas? ");
        int hora = analise.nextInt();
        if(hora<12) {
        	System.out.println("Bom dia!");
        } else if (hora>=12 && hora<18) {
        	System.out.println("Boa tarde!");
        } else {
        	System.out.println("Boa noite!");
        }
	}

}
