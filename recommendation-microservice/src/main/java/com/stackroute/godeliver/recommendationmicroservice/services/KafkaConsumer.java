package com.stackroute.godeliver.recommendationmicroservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.godeliver.recommendationmicroservice.listners.BookListner;
import com.stackroute.godeliver.recommendationmicroservice.nodes.Book;
import com.stackroute.godeliver.recommendationmicroservice.repositories.BookRepository;

/**
 * 
 * @author syam
 *
 */
// this is where everthing happens
// we listen from the kafka to the pojo classes, and then assign respectives
// values to the respective classes and call the objects of nodes, and save them
// into relationships, and finally calling the repositories objects and call the
// curd operations based on the message we get.
@Service
public class KafkaConsumer {
	private BookRepository bookRepository;

	@Autowired
	public KafkaConsumer(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@KafkaListener(topics = "Book", groupId = "group_json", containerFactory = "bookKafkaListenerFactory")
	public void consumeJson(BookListner bookListner) {
		System.out.println("Consumed JSON Message: " + bookListner);
		Book book = new Book(bookListner.getNodeId(), bookListner.getId(), bookListner.getTitle(),
				bookListner.getRating(), bookListner.getPublishedYear());
		bookRepository.save(book);
	}

}
