package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private String email;
	private LocalDate dataA;
	
	public Client() {
		
	}

	public Client(String name, String email, LocalDate dataA) {
		super();
		this.name = name;
		this.email = email;
		this.dataA = dataA;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDataA() {
		return dataA;
	}
	
	public void setDataA(LocalDate dataA) {
		this.dataA = dataA;
	} 
	
	public String toString() {
		String s = ("Client: " +this.getName()+ "("+this.getDataA().format(fmt1)+") - "+ this.getEmail()+".");
		return s;
	}
}
