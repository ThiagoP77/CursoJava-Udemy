package programa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidade.enums.OrderStatus;
import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.Product;

public class Programa {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner analise = new Scanner (System.in);
		Scanner analisei = new Scanner (System.in);
		Scanner analised = new Scanner (System.in);
		Scanner analisedo = new Scanner (System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Nome: ");
		String n = analise.nextLine();
		System.out.print("Email: ");
		String e = analise.next();
		System.out.print("Data de aniversário (dd/MM/yyyy): ");
		String d = analise.next();
		LocalDate da = LocalDate.parse(d, fmt1);
		
		Client c = new Client (n, e, da);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String o = analise.next();
		OrderStatus or = OrderStatus.valueOf(o);
		System.out.print("How many itens? ");
		int q = analisei.nextInt();
		
		Order ord = new Order (LocalDateTime.now(), or);
		
		for (int f = 0; f < q; f++) {		
			System.out.println("Enter "+(f+1)+"# item data: ");
			System.out.print("Product name: ");
			String na = analise.nextLine();
			analise.next();
			System.out.print("Product price: ");
			double dou = analisedo.nextDouble();
			System.out.print("Product quantity: ");
			int qu = analisei.nextInt();
			
			Product p1 = new Product (na, dou);
			OrderItem oi = new OrderItem (qu, p1);
			ord.addList(oi);
		}
		
		System.out.println("Order Sumary: ");
		System.out.println("Order Status: "+ord.getStatus()+".");
		System.out.println(c.toString());
		System.out.println("Order Itens: ");
		System.out.println(ord.Total());
		
	}

}
