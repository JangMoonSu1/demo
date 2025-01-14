package com.example.demo.entity;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity 
@Table(schema="test", name = "jpa")
public class Customer {
 
	@Id
	private int id;
	private String name; 
	

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;		
	}
	
	public static Customer sample()
	{
		return new Customer(2, "이름");
	}
}
