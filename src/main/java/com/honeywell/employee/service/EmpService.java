package com.honeywell.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.employee.model.EmpModel;
import com.honeywell.employee.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	private EmpRepository repository;
	
	public EmpModel saveEmp(EmpModel employee) {
		return repository.save(employee);
	}
	
	public List<EmpModel> saveEmployees(List<EmpModel> employees){
		return repository.saveAll(employees);
	}
	
	

}
