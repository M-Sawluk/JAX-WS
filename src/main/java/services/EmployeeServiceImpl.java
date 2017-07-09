package services;

import domain.Employee;

import javax.jws.WebService;

/**
 * Created by Mike on 2017-07-09.
 */

@WebService
public class EmployeeServiceImpl implements EmployeeService {

    public Employee getEmployeeById(String id) {
        return new Employee("1","Dick");
    }
}
