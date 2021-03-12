package id.co.employee.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import id.co.employee.dto.req.EmployeeReqDto;
import id.co.employee.dto.resp.EmployeeRespDto;
import id.co.employee.service.IEmployeeService;

@RunWith(MockitoJUnitRunner.class)
class EmployeeControllerTest {

	  @Mock
	  IEmployeeService employeeService = Mockito.mock(IEmployeeService.class);
	  
	  @InjectMocks
	  EmployeeController controller = new EmployeeController(employeeService);
	  
	  @Test
	  void find(){

		  ResponseEntity<EmployeeRespDto> resp =controller.find(100l);
		  assertNotNull(resp);
	  }
	  @Test
	  void addWithoutValidRequest(){

		  ResponseEntity<EmployeeRespDto> resp = controller.add(new EmployeeReqDto("", ""));
		  assertEquals(HttpStatus.BAD_REQUEST, resp.getStatusCode());
	  }
	  @Test
	  void addWithValidRequest(){

		  ResponseEntity<EmployeeRespDto> resp = controller.add(new EmployeeReqDto("Employee 1", "Jakarta"));
		  assertNotNull(resp);
	  }
	  

}
