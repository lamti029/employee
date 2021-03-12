package id.co.employee.dto.req;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.*;


@ToString
public class EmployeeReqDto {
	@NotNull(message = "Please provide Employee Name")
	@NotEmpty(message = "Please provide Employee Name")
	private String employeeName;

	@NotNull(message = "Please provide Employee  Address")
	@NotEmpty(message = "Please provide Employee  Address")
	private String employeeAddress;
	
	public EmployeeReqDto(){
		
	}
	public EmployeeReqDto(String employeeName,
			String employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}


	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}
