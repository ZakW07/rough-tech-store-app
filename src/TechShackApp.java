
public class TechShackApp {

	public static void main(String[] args) {
		InventoryManager test1 = new InventoryManager();
		Laptop asus = new Laptop("Zenbook",799.99,3,"Ryzen 7 9800X3D");
		Smartphone samsung = new Smartphone("Samsung",899.99,3,200);
		
		test1.addToInventory(samsung);
		test1.addToInventory(asus);
		
		test1.addToInventory(asus);
		
		test1.addToCart("Zenbook");
		test1.addToCart("Zenbook");
		test1.addToCart("Zenbook");
		test1.removeFromCart("Zenbook");
		
		test1.checkout();
		
	}

}
