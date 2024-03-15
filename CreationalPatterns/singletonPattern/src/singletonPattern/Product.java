package singletonPattern;


public class Product {
	private String name;
	private int quantity;
	private int price;
	
	public Product (String name, int cantidad, int price) {
		this.name = name;
		this.quantity = cantidad;
		this.price = price;
	}
	
	public String getName () {
		return this.name;
	}
	
	public int getCantidad () {
		return this.quantity;
	}
	
	public int getPrice () {
		return this.price;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setCantidad (int cantidad) {
		this.quantity = cantidad;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
}
