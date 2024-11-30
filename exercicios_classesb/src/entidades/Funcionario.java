package entidades;

public class Funcionario {
	public String nome;
	public double salarioB;
	public double taxa;
	
	public double netSalary() {
		return salarioB - taxa;
	}
	
	public void increaseSalary(double percentage) {
		salarioB += salarioB * percentage / 100.0;
	}
	
	public String toString() {
		return "Funcionário: "
				+ this.nome
				+", R$"
				+ String.format("%.2f.", this.netSalary());	
	}
	

}
