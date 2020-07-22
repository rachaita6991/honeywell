package com.honeywell.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.employee.model.EmpModel;
import com.honeywell.employee.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService service;
	
	@PostMapping("/addEmployee")
	public EmpModel addemployee(@RequestBody EmpModel employee) {
		return service.saveEmp(employee);
	}
	
	@PostMapping("/addEmployees")
	public List<EmpModel> addemployees(@RequestBody List<EmpModel> employees) {
		return service.saveEmployees(employees);
	}
	
	

}
