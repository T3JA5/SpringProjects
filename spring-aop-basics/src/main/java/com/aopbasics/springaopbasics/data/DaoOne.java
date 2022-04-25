package com.aopbasics.springaopbasics.data;

import org.springframework.stereotype.Repository;

import com.aopbasics.springaopbasics.aspect.TrackTime;

@Repository
public class DaoOne {

	@TrackTime
	public String retriveSome() {
		return "DAO1";
	}
}
