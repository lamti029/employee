package id.co.employee.service;

import id.co.employee.domain.model.Employee;

public interface IEmployeeService {
    Employee findByUserId(Long userId);

    Employee save(Employee emp);
}
