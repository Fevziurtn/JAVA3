package youtubeInheritance;

public class Main {

	public static void main(String[] args) {
		// CLASS'LAR DA KULLANILIR: MİRAS ANLAMINA GELMEKTE.
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.Add();
	}

}
