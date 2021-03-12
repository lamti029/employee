package id.co.employee.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.co.employee.domain.model.Employee;
import id.co.employee.repository.IEmployeeRepository;
import id.co.employee.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private IEmployeeRepository employeeRepository;

    public EmployeeServiceImpl(IEmployeeRepository employeeRepository) {
    	this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findByUserId(Long userId) {
        Employee emp = employeeRepository.findByUserId(userId);
        if(logger.isDebugEnabled()) {
            logger.debug("userId: ".concat(String.valueOf(userId)).concat(" || ").concat(emp.toString()));
        }
        return emp;
    }

    @Override
    public Employee save(Employee emp) {
    	Employee saved = employeeRepository.save(emp);
        if(logger.isDebugEnabled()) {
            logger.debug("emp: ".concat(emp.getUserId().toString()).concat(" || ").concat(emp.toString()));
        }
        return saved;
    }

	
}
