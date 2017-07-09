import services.Employee;
import services.EmployeeServiceImpl;
import services.EmployeeServiceImplService;

/**
 * Created by Mike on 2017-07-09.
 */
public class Main {
    //http://localhost:8080/employeeservice?wsdl

    public static void main(String[] args) {
        EmployeeServiceImplService employeeServiceImplService = new EmployeeServiceImplService();
        EmployeeServiceImpl employeeService = employeeServiceImplService.getEmployeeServiceImplPort();
        Employee employee = employeeService.getEmployeeById("1");

        System.out.println(employee.getName());
    }
}
