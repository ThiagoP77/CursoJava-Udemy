package programas;

import java.util.Set;
import java.util.TreeSet;

import entidades.Product;

public class OrdernandoTreeSet1 {

	public static void main(String[] args) {
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
