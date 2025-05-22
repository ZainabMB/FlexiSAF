package com.example;

import java.util.ArrayList;
/**
 *
 * @author ZainabMB
 */
public class Collection {
    private ArrayList<Book> BookCollection;
    
    
    public Collection(){
        BookCollection = new ArrayList<>();
    }
    
    public void addBook(Book book){
        BookCollection.add(book);
    }
    //using the isbn (which is a unique number for books) to identify the book to be removed from the collection 
    public void removeBook(String isbn){
        //loop through the collection
       for (int i=0; i<BookCollection.size(); i++){
           //check if the isbn provided is equals to any existing book
        if (isbn.equals(BookCollection.get(i).getISBN())) {
            //remove book if equal 
            BookCollection.remove(i);
            i--; 
       
     }}}
    
    //method to print the array of books
    public void printCollection(){
        System.out.println("The current books in the collection are: ");
           for (Book book : BookCollection) {
            System.out.println(book);
        }
    }
    /**
     * @param args the command line arguments
     */
    
    //implement main method 
    public static void main(String[] args) {
        //create an instance of the class collection (object) 
        Collection collection = new Collection();
        
        //create "Book" objects 
        Book book1 = new Book("R.F. Kuang", "The Poppy War", "978-0-00-833918-0");
        Book book2 = new Book ("Frank Herbert", "Dune", "978-0-340-96019-6");
        Book book3 = new Book("George R.R. Martin", "A Game of Thrones", "0-00-2244584-1");
        
        //use add book method to add books to the collection 
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);
        
        //print the collection to ensure the books have been added 
        System.out.println("");
        collection.printCollection();
        System.out.println("");
        //remove a book (Dune) 
        collection.removeBook("978-0-340-96019-6");
        //print to ensure the book has been removed 
        collection.printCollection();
    }
    
}