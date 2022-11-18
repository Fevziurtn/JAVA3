package youtubeFieldAttribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "laptop";
		product.id = 1;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		
		ProdcutManager prodcutManager = new ProdcutManager();
		prodcutManager.Add(product);
		
		//System.out.println(product.name);

	}

}
