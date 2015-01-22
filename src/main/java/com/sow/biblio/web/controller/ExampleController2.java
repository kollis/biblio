package com.sow.biblio.web.controller;

/*import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sow.biblio.service.IExampleService1;
import com.sow.biblio.service.IExampleService2;
import com.sow.biblio.service.model.Department;
import com.sow.biblio.service.model.Department2;
import com.sow.biblio.service.model.Employee;
import com.sow.biblio.service.model.Employee2;

@Controller

@RequestMapping("/controller2") */

public class ExampleController2 {
	
	
/*	@Resource
	private MessageSource messageSource;
	
	@Resource
	private IExampleService2 exampleService2;
	
	
	@RequestMapping("/getEmployee.htm")
	public String getEmployee(ModelMap model) {
		
		Employee2 employee = exampleService2.getEmployee(102l);
		
		Long deptId = employee.getDepartment() == null ? null : employee.getDepartment().getDeptId();
		
		System.out.println("\n*****Employee Id, FirstName, LastName, Designation, DeptId:" + employee.getEmpId() + ", " + employee.getFirstName() + ", " + employee.getLastName() 
				+ ", " + employee.getDesignation() + ", " + deptId);
		
		return "sample";
	}
	
	@RequestMapping("/getAllEmployees.htm")
	public String getAllEmployees(ModelMap model) {
		
		List<Employee2> employeeList = exampleService2.getAllEmployees();
		
		System.out.println("\n\n\n*****employeeList size:" + employeeList.size());
		
//		for (Employee2 employee : employeeList) {
//			
//			Long deptId = employee.getDepartment() == null ? null : employee.getDepartment().getDeptId();
//		
//			System.out.println("\n*****Employee Id, FirstName, LastName, Designation, DeptId:" + employee.getEmpId() + ", " + employee.getFirstName() + ", " + employee.getLastName() 
//				+ ", " + employee.getDesignation() + ", " + deptId);
//		}
		
		return "sample";
	}
	
	@RequestMapping("/getAllDepartments.htm")
	public String getAllDepartments(ModelMap model) {
		
		List<Department2> departmentList = exampleService2.getAllDepartments();
		
		return "sample";
	}
	
	@RequestMapping("/createAndSaveMultipleEmployeesWithNullDepartment.htm")
	public String createAndSaveMultipleEmployeesWithNullDepartment(ModelMap model) {
		
		exampleService2.createAndSaveMultipleEmployeesWithNullDepartment();
		
		return "sample";
	}
	
	@RequestMapping("/createAndSaveMultipleEmployeesWithAssignedKey.htm")
	public String createAndSaveMultipleEmployeesWithAssignedKey(ModelMap model) {
		
		exampleService2.createAndSaveMultipleEmployeesWithAssignedKey();
		
		return "sample";
	}
	
	@RequestMapping("/saveNewEmployeeWithExistingDeptId.htm")
	public String saveNewEmployeeWithExistingDeptId(ModelMap model) {
		
		exampleService2.saveNewEmployeeWithExistingDeptId();
		
		return "sample";
	}
	
	@RequestMapping("/saveNewEmployeeWithExistingDept.htm")
	public String saveNewEmployeeWithExistingDept(ModelMap model) {
		
		exampleService2.saveNewEmployeeWithExistingDept();
		
		return "sample";
	}

	@RequestMapping("/saveNewEmployeeWithNewDept.htm")
	public String saveNewEmployeeWithNewDept(ModelMap model) {
		
		exampleService2.saveNewEmployeeWithNewDept();
		
		return "sample";
	}
	
	@RequestMapping("/saveNewDepartmentWithExistingEmployee.htm")
	public String saveNewDepartmentWithExistingEmployee(ModelMap model) {
		
		exampleService2.saveNewDepartmentWithExistingEmployee();
		
		return "sample";
	}
	
	*/
}
