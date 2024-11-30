package entidades;

public class Estudante {
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return nota1+nota2+nota3;
	}
	
	public void aprovacao() {
		if(this.media()>=60) {
			System.out.println("Aprovado!");
		} else {
			double falta = 60 - this.media();
			System.out.println("Reprovado!");
			System.out.printf("Faltam %.2f pontos!", falta);
		}
	}
	
}
