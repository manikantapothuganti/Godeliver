package com.stackroute.godeliver.recommendationmicroservice.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.godeliver.recommendationmicroservice.nodes.Book;

public interface BookRepository extends Neo4jRepository<Book, Long> {

}
