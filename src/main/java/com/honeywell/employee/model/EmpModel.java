package com.honeywell.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Emp_Tbl")
public class EmpModel {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double age;
	private String gender;

}
