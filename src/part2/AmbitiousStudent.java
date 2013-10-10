package part2;

import part1.Book;

public class AmbitiousStudent extends Student {

	int first_book;
	
	public AmbitiousStudent(String name, Library lib, int first_book) {
		super(name, lib);
		this.first_book = first_book;
		// TODO Auto-generated constructor stub
	}


	public void run(){
		
		for(int i = 0; i<2; i++){
			library.getBooks().get((0+first_book)%3).checkout(name);
			library.getBooks().get((1+first_book)%3).checkout(name);
			library.getBooks().get((2+first_book)%3).checkout(name);
			useBook(1000);
			
			
			library.getBooks().get(2).checkIn(name);
			library.getBooks().get(1).checkIn(name);
			library.getBooks().get(0).checkIn(name);
			
			
		}
	}

	public synchronized void checkout(Book book){
		
		book.checkout(name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book.checkIn(name);
		
	}
	
	public void useBook(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String nameGet(){
		return name;
	}
}
