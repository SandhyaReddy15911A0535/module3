package com.capg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Details;
import com.capg.service.TDSService;
import com.capg.utility.UserNotFoundException;

@RestController
public class TDSController {
	@Autowired
	TDSService tds;
	@GetMapping("/")
	public String hello() {
		return "hai";
	}
	@GetMapping("/getById/{id}")
	public Details getByPid(@PathVariable int id) throws UserNotFoundException {
		Details details=tds.getByPid(id);
		if(details==null) {
			throw new UserNotFoundException("user not found "+id);
		}
		else
			return details;
	}
	
}
