package entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entidade.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	private List<OrderItem> lista = new ArrayList<>();
	
	
	
	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public LocalDateTime getMoment() {
		return moment;
	}
	
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	public void addList(OrderItem o) {
		lista.add(o);
	}
	
	public void removeList(OrderItem o) {
		lista.remove(o);
	}
	
	public String Total() {
		double sum = 0;
		StringBuilder s = new StringBuilder();
		for (OrderItem o : lista) {
			Product p = o.getProduto();
			sum += o.subTotal();
			s.append(p.toString()+", Quantidade: "+o.getQuantidade()+", Subtotal: R$"+o.subTotal()+". \n");
		}
		s.append("Total: R$"+sum+".");
		return s.toString();
	}
}
