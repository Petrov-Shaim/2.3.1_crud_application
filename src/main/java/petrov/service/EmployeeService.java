package petrov.service;

import petrov.entity.User;

import java.util.List;

public interface EmployeeService {
    public List<User> getAllEmployees();
    public void saveEmployee(User employee);
    public User getEmployee(int id);
    public void deleteEmployee(int id);
}
