import java.util.List;

public interface EmployeeDAO {

	//Basic CRUD operations
	public List<Employee> getAllEmployees();
	public List<Employee> getEmployeeById(int id);
	public void updateEmployeeById(int id);
	public void deleteEmployeeById(int id);
	public void addEmployeeById(Employee e);

	//Specific operation relating to employees
	public List<Employee> getAllEmployeesByStore(String storeID);
}