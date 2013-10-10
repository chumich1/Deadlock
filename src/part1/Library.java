package part1;

import java.util.ArrayList;

public class Library extends Thread{

	ArrayList<Book> books;

	
	public Library(){
		books = new ArrayList<Book>();
		
		books.add(new Book("Speaker for the Dead", false));
		books.add(new Book("Brain Surgery: For Dummies", false));
		books.add(new Book("Pilgrim at Tinker Creek", false));
		books.add(new Book("Mein Kampf", false));
	
		
		
	}
	

	public Library(ArrayList<Book> books, ArrayList<Student> students){
		this.books = books;
	
	}
	
	public void run(){
		
	}
	
	public ArrayList<Book> getBooks() {
		return books;
	}





	
	public void addBook(Book book){
		this.books.add(book);
	}
	

	
}
