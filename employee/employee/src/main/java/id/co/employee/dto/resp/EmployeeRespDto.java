package id.co.employee.dto.resp;

import id.co.employee.domain.model.Employee;
import id.co.employee.status.StatusCode;
import lombok.ToString;

@ToString
public class EmployeeRespDto {
  
	private Employee employee;
    private StatusCode statusCode;
    
    public EmployeeRespDto() {
  		super();
  	}
  	public EmployeeRespDto(Employee employee, StatusCode statusCode) {
  		super();
  		this.employee = employee;
  		this.statusCode = statusCode;
  	}
  	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public StatusCode getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}
}
