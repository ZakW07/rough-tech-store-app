
public class Laptop extends Product {
	private String processor;
	
	public Laptop(String name, double price, int stock, String processor) {
		super(name,price,stock);
		this.processor = processor;
	}
	
	@Override
	public void displaySpec() {
		System.out.println("Name: "+getName()+"| Price: "+getPrice()+"| Stock: "+getStockLevel()+"| CPU: "+processor+"|");
	}
}
