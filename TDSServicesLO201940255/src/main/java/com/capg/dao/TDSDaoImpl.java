package com.capg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.capg.model.Details;
@Repository
@ComponentScan("com.capg.controller")
public class TDSDaoImpl implements TDSDao {

	
@PersistenceContext EntityManager entityManager;
	
	
	public Details getByPid(int pId) {
		// TODO Auto-generated method stub
		Details details=entityManager.find(Details.class, pId);
		return details;
	}
	
}
