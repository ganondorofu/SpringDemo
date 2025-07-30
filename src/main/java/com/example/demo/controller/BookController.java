package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;

@RestController
public class BookController {

	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
	public String books() {
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books/author")
	public String booksWithAuthor(@RequestParam String name) {
		return bookService.getBooksWithAuthor(name);
	}
	
	@GetMapping("/books/genre")
	public String booksWithGenre(@RequestParam String name) {
		return bookService.getBooksWithGenre(name);
	}
}
