package id.co.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.employee.domain.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByUserId(Long userId);
}
