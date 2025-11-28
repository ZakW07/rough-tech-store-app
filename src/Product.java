
public abstract class Product {
	private String name;
	private double price;
	private int stockLevel;
	
	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stockLevel = stock;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getStockLevel() {
		return stockLevel;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setPrice(double value) {
		price = value;
	}
	
	public void setStockLevel(int stock) {
		stockLevel = stock;
	}
	
	public abstract void displaySpec();
}
