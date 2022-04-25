package com.spring.basics.springbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.classes.ReadProperties;

// Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringPropertyReader.class)
class SpringBasicsApplicationTests {

	// Get the bean from context
	ReadProperties rp;
	
	@Test
	void contextLoads() {
		String s = rp.getUrl();
		assertEquals("https://start.spring.io/", s);
	}

}
