package com.example.demo.model;

public class Reference extends Book{
	public Reference(String name, String author, String genre){
		super(name, author, genre);
	}
	
	public String getGenre(){
		return "reference";
	}
}
