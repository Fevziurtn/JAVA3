package youtubePolymorphisim;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void Add() {
		System.out.println("Musteri eklendi.");
		DatabaseLogger logger = new DatabaseLogger();
		//logger.log("Log mesajı");
		this.logger.log("log mesaji");
	}
}
