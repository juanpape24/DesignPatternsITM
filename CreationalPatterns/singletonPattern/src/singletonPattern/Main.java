package singletonPattern;

public class Main {

	public static void main(String[] args) {
		
		InventaryWrapper iv =  InventaryWrapper.getInstance();
		Product pt1 = new Product("pineapple", 5, 5000);
		iv.addProduct(pt1);
		

		Product pt2 = new Product("apple", 1, 2500);
		InventaryWrapper ivw = InventaryWrapper.getInstance();
		ivw.updateProduct(pt2);
		
		ivw.GetProducts();
	}

}
