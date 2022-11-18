package youtubeFieldAttribute;

public class ProdcutManager {
	public void Add(Product product) {
		//JDBC yazarak veritabanına kaydedlecek
		System.out.println("Ürün eklendi "+ product.name);
	}
}
