package entidades;

public class OrderItem {
	private int quantidade;
	private double price;
	private Product produto;
	
	public OrderItem () {
		
	}
	
	public OrderItem(int quantidade, Product produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
		this.price = produto.getPrice();
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Product getProduto() {
		return produto;
	}
	
	public void setProduto(Product produto) {
		this.produto = produto;
		this.price = produto.getPrice();
	}
	
	public double subTotal() {
		return price*quantidade;
	}
}
