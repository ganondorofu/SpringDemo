package com.example.demo.service;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.Novel;
import com.example.demo.model.PictureBook;
import com.example.demo.model.Reference;

@Service
public class BookService {
	ArrayList<Book> books = new ArrayList<>();
	
	public BookService() {		
		books.add(new PictureBook("はらぺこあおむし", "エリックカール", "pictureBook"));
		books.add(new Novel("ノルウェイの森", "	村上春樹", "novel"));
		books.add(new Reference("Java言語で学ぶデザインパターン", "結城浩", "reference"));
		books.add(new Novel("君の名は。", "新海誠", "novel"));
		books.add(new Reference("リーダブルコード", "Dustin Boswell", "reference"));
	}
	
	public String getAllBooks() {
		return makeResponse(books, "全データ取得結果:");
	}
	
	public String getBooksWithAuthor(String author) {
		ArrayList<Book> response = new ArrayList<>();
		for (Book b: books) {
			if (b.getAuthor().equals(author)) {
				response.add(b);
			}
		}
		return makeResponse(response, "著者(" + author + ")で絞り込んだ結果:");
	}
	
	public String getBooksWithGenre(String genre) {
		ArrayList<Book> response = new ArrayList<>();
		for (Book b: books) {
			if (b.getGenre().equals(genre)) {
				response.add(b);
			}
		}
		return makeResponse(response, "ジャンル(" + genre + ")で絞り込んだ結果:");
	}
	
	private String makeResponse(ArrayList<Book> books, String header) {
		String response = header + "<br>";
		
		for (Book b : books) {
			response += "本の名前:" + b.getTitle() + "<br>";
			response += "本の著者:" + b.getAuthor() + "<br>";
			response += "本のジャンル:" + b.getGenre() + "<br><br>";
		}
		
		return response;
	}
}
