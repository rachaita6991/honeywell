package com.honeywell.employee.repository;

import com.honeywell.employee.model.EmpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpModel,Integer> {
	
//	@Query(value="SELECT name from Emp_Tbl where gender LIKE 'F' and age >= min(age) and age<=max(age)");

}
