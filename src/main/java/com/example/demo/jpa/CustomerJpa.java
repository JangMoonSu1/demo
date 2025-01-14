package com.example.demo.jpa;

import com.example.demo.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CustomerJpa {

	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
	EntityManager em =   emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
		
	tx.begin();
	
	em.persist(Customer.sample());
	
	tx.commit();
	em.close();
	emf.close();
	}
	
}
