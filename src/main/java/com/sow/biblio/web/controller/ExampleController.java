package com.sow.biblio.web.controller;

/*import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sow.biblio.service.IExampleService1;
import com.sow.biblio.service.model.Department;
import com.sow.biblio.service.model.Employee;

@Controller */

public class ExampleController {
	
	
/*	@Resource
	private MessageSource messageSource;
	
	@Resource
	private IExampleService1 exampleService1;
	
	@RequestMapping("/getAllDepartments.htm")
	public String getAllBooks1(ModelMap model) {
		
		List<Department> departmentList = exampleService1.getAllDepartments();
					
		for (Department department : departmentList) {
			System.out.println("\n*****DeptId, Dept Name:" + department.getDeptId() + ", " + department.getDeptName());
		}
			
		return "sample";
	}
	
	@RequestMapping("/saveDepartment.htm")
	public String saveDepartment(ModelMap model) {
		
		exampleService1.saveDepartment();
		
		List<Department> departmentList = exampleService1.getAllDepartments();
					
		for (Department department : departmentList) {
			System.out.println("\n*****DeptId, Dept Name:" + department.getDeptId() + ", " + department.getDeptName());
		}
			
		return "sample";
	}
	
	@RequestMapping("/saveEmployee.htm")
	public String saveEmployee(ModelMap model) {
		
		exampleService1.saveEmployee();
		
		List<Employee> employeeList = exampleService1.getAllEmployees();
					
		for (Employee employee : employeeList) {
			System.out.println("\n*****Employee Id, FirstName, LastName, Designation:" + employee.getEmpId() + ", " + employee.getFirstName() + ", " + employee.getLastName() 
										+ ", " + employee.getDesignation());
		}
			
		return "sample";
	}
	
	@RequestMapping("/saveEmployeeWithId.htm")
	public String saveEmployeeWithId(ModelMap model) {
		
		exampleService1.saveEmployeeWithId(102l);
		
		List<Employee> employeeList = exampleService1.getAllEmployees();
					
		for (Employee employee : employeeList) {
			System.out.println("\n*****Employee Id, FirstName, LastName, Designation:" + employee.getEmpId() + ", " + employee.getFirstName() + ", " + employee.getLastName() 
										+ ", " + employee.getDesignation());
		}
			
		return "sample";
	}
	
	@RequestMapping("/getEmployee.htm")
	public String getEmployee(ModelMap model) {
		
		Employee employee = exampleService1.getEmployee(102l);
		
		System.out.println("\n*****Employee Id, FirstName, LastName, Designation:" + employee.getEmpId() + ", " + employee.getFirstName() + ", " + employee.getLastName() 
				+ ", " + employee.getDesignation());
		
		return "sample";
	}
	
	@RequestMapping("/saveEmployee1.htm")
	public String saveEmployee1(ModelMap model) {
		
		Employee employee = exampleService1.getEmployee(102l);
		
		employee.setDesignation("Janitor2");
		
		exampleService1.saveEmployee(employee);
		
		return "sample";
	}
	
	*/
}
