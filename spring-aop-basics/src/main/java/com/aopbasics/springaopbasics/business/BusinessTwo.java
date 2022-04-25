package com.aopbasics.springaopbasics.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aopbasics.springaopbasics.aspect.TrackTime;
import com.aopbasics.springaopbasics.data.DaoTwo;

@Service
public class BusinessTwo {

	@Autowired
	DaoTwo dao2;
	
	@TrackTime
	public String calculateSome() {
		return dao2.retriveSome();
	}
}
