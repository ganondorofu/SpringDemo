package com.example.demo.model;

public class PictureBook extends Book{
	public PictureBook(String name, String author, String genre){
		super(name, author, genre);
	}
	
	public String getGenre(){
		return "pictureBook";
	}
}
