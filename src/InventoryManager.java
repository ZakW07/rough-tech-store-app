import java.util.ArrayList;
import java.util.HashMap;

public class InventoryManager {
	private ArrayList<Product> shoppingCart;
	private HashMap<String, Product> inventory;
	
	public InventoryManager() {
		shoppingCart = new ArrayList<Product>();
		inventory = new HashMap<String,Product>();
	}
	
	public void addToInventory(Product p) {
		if (inventory.get(p) != null) {
			System.out.println("Product ["+p.getName()+"] already exists");
		}
		else
			inventory.put(p.getName(),p);
	}
	
	public void addToCart(String productName) {
		Product p = inventory.get(productName);
		
		if (inventory.containsKey(productName) == true) {
			if (p.getStockLevel() > 0) {
				shoppingCart.add(p);
				p.setStockLevel(p.getStockLevel()-1);
			}
			else
				System.out.println("Out of stock");
		}
		else
			System.out.println("Product not found");
	}
	
	public void removeFromCart(String productName) {
		Product p = inventory.get(productName);
		for (int i = 0; i < shoppingCart.size(); i++) {
			if (shoppingCart.get(i).getName().equalsIgnoreCase(productName)) {
				shoppingCart.remove(i);
				p.setStockLevel(p.getStockLevel()+1);
				break;
			}
		}
	}
	
	public void checkout() {
		double totalCost = 0;
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).displaySpec();
			totalCost += shoppingCart.get(i).getPrice();
		}
		System.out.println("Total Cost: £"+totalCost);
		shoppingCart.clear();
	}
}
