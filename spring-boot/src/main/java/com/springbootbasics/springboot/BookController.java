package com.springbootbasics.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getAllBook() {
		return Arrays.asList(new Book(1, "Silent Patient 1", "Alex"));
	}
	
}
