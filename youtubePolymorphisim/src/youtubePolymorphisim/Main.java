package youtubePolymorphisim;

public class Main {

	public static void main(String[] args) {
		/*EmailLogger emailLogger = new EmailLogger();
		emailLogger.Log("Log mesaji");*/
		
	//	BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
	//	for (BaseLogger logger : loggers) {
	//		logger.Log("Log mesaji");
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
		}

	}


