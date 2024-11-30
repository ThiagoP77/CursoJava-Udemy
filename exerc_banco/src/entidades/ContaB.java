package entidades;

public class ContaB {
	private int numero;
	private String nome;
	private double saldo;
	
	public ContaB(int numero, String nome, double depInicial) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = depInicial;
	}

	public ContaB(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= (valor+5);
	}
	
	public String mostrar() {
		return "Conta: "
				+ this.getNumero()
				+ ","
				+ "Proprietário: "
				+ this.getNome()
				+ ", Saldo: "
				+ String.format("%.2f.", this.getSaldo());
	}
}
