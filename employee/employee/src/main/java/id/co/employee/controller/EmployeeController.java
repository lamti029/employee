package id.co.employee.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.co.employee.domain.model.Employee;
import id.co.employee.dto.req.EmployeeReqDto;
import id.co.employee.dto.resp.EmployeeRespDto;
import id.co.employee.service.IEmployeeService;
import id.co.employee.status.StatusCode;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);


    @Autowired
    IEmployeeService employeeService;
    
    public EmployeeController( IEmployeeService employeeService){
    	this.employeeService = employeeService;
    }
    @RequestMapping(value="/find", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<EmployeeRespDto> find(@Valid @RequestParam Long userId){
    
    	if (logger.isInfoEnabled()){
            logger.info("Incomming /employee/find :"+ userId);
        }
    	EmployeeRespDto resp = new EmployeeRespDto();
    	resp.setEmployee(employeeService.findByUserId(userId));
        if(resp.getEmployee() != null){
        	resp.setStatusCode(new StatusCode("00", "User found"));
        } else {
        	resp.setStatusCode(new StatusCode("99", "User not found!"));
        }
        return new ResponseEntity<EmployeeRespDto>(resp,HttpStatus.OK);
       
    }

    @RequestMapping(value="/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<EmployeeRespDto> add(@Valid @RequestBody EmployeeReqDto reqDto){
        if (logger.isInfoEnabled()){
            logger.info("Incomming /employee/add :".concat(reqDto.toString()));
        }
        EmployeeRespDto resp = new EmployeeRespDto();
        HttpStatus httpSatus = HttpStatus.OK;
    	resp.setEmployee( employeeService.save(new Employee(reqDto.getEmployeeName(),reqDto.getEmployeeName())));
        if(resp.getEmployee() != null){
        	resp.setStatusCode(new StatusCode("00", "Add new employee success."));
        } else {
        	resp.setStatusCode(new StatusCode("98", "Add new employee error."));
        	httpSatus = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<EmployeeRespDto>(resp,httpSatus);
    }


}
