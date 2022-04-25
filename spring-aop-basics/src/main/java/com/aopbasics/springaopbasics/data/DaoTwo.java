package com.aopbasics.springaopbasics.data;

import org.springframework.stereotype.Repository;

@Repository
public class DaoTwo {

	public String retriveSome() {
		return "DAO2";
	}
}
