package youtubeEncapsulation;

public class ProductManager {

	public void Add(Product product) {
		// JDBC yazarak veritabanına kaydedlecek
		System.out.println("Ürün eklendi " + product.getName());
	}
}
