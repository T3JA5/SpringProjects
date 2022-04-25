package com.aopbasics.springaopbasics.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aopbasics.springaopbasics.data.DaoOne;

@Service
public class BusinessOne {

	@Autowired
	DaoOne dao1;
	
	public String calculateSome() {
		return dao1.retriveSome();
	}
}
