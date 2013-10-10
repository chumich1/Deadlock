package part1;

public class Student extends Thread {
	private String name;
	private Library library;
	
	
	public Student(String name, Library lib){
		this.name = name;
		this.library = lib;
	}
	
	public Student(){
		
	}
	

	public void run(){
		for(int i = 0; i<10; i++){
			checkout(library.getBooks().get(0));
		}
	}

	public synchronized void checkout(Book book){
		
		book.checkout(name);
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book.checkIn(name);
		
	}
	
	public String nameGet(){
		return name;
	}
	
}
