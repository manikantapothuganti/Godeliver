package com.stackroute.godeliver.recommendationmicroservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.godeliver.recommendationmicroservice.nodes.Book;
import com.stackroute.godeliver.recommendationmicroservice.repositories.BookRepository;

@RestController
@RequestMapping(value = "/api/v1")
public class Controller {
	private BookRepository bookRepository;

	@GetMapping(value = "/")
	public String hello() {
		return "Hi App is under development";
	}

	@RequestMapping(value = "/getbooksfromdatabase", method = RequestMethod.GET)
	public ResponseEntity<?> getAllBooksFromDatabase() {

		return new ResponseEntity<Iterable<Book>>(bookRepository.findAll(), HttpStatus.OK);

	}

}
