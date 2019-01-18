package org.wrokprocess.bomservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "bill_of_material")
public class BillOfMaterial {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
	@Column(name = "name")
	private String name;
 
	@Column(name = "age")
	private int age;
	

}