
public class Smartphone extends Product {
	private int cameraMegaPixels;
	
	public Smartphone(String name, double price, int stock, int cameraMegaPixels) {
		super(name,price,stock);
		this.cameraMegaPixels = cameraMegaPixels;
	}
	
	@Override
	public void displaySpec() {
		System.out.println("Name: "+getName()+"| Price: "+getPrice()+"| Stock: "+getStockLevel()+"| MP: "+cameraMegaPixels+"|");
	}
}
