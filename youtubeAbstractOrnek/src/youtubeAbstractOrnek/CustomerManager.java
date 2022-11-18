package youtubeAbstractOrnek;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		//KULLANILMAMALI BAĞIMLILIK OLUR :  OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		databaseManager.getData();
	}
}
