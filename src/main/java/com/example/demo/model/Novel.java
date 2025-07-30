package com.example.demo.model;

public class Novel extends Book{
	public Novel(String name, String author, String genre){
		super(name, author, genre);
	}
	
	public String getGenre(){
		return "novel";
	}
}
