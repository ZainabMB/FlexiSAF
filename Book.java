package com.example;

public class Book {
    private String Author;
    private String Title;
    public String ISBN;
    
    public Book(String Author, String Title, String ISNB){
        this.Author= Author;
        this.Title = Title;
        this.ISBN = ISNB;
    }
    
    public String getAuthor() { 
        return Author;
    }
    
    public String getTitle() {
        return Title; 
    }
    
    public String getISBN() { 
        return ISBN;
    }

    @Override
    public String toString() {
        return "Title: " + Title + ", Author: " + Author + ", ISBN: " + ISBN;
    }
    
}
