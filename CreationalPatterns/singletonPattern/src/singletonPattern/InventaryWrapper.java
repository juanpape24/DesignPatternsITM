package singletonPattern;
import java.util.ArrayList;
import java.util.List;

public class InventaryWrapper {

	private static InventaryWrapper inventary;
	private static List<Product> productList = new ArrayList<Product>();
    	
    private InventaryWrapper() {
		Product pt1  = new Product("orange", 22, 550);
		productList.add(pt1);
		Product pt2  = new Product("apple", 2, 2000);
		productList.add(pt2);
	}
    	
	public static InventaryWrapper getInstance() {
		if(inventary == null) {
			inventary = new InventaryWrapper();
	    	System.out.print("se creo nueva instancia...!\n");
		}else {
	    	System.out.print("se usa instancia existente...!\n");
		}
		return inventary;
	}
	
    public void addProduct(Product product){
		productList.add(product);
    	System.out.print("Producto " + product.getName() + " agregado\n");
    }

    public void updateProduct(Product pr ) {
    	for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName() == pr.getName()) {
            	productList.set(i, pr);
                break;
            }
        }
    	System.out.print("Producto "+pr.getName()+" actualizado\n");
    }
    
    public void GetProducts(){
    	System.out.println("\nInventario actual:");
    	for (Product p : productList) {
            System.out.println("Producto: "+p.getName()+ ", cantidad: " + p.getCantidad() + ", precio: " +p.getPrice());
        }
    }
}
