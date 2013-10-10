package part1;

public class Book {

	private String name;
	private boolean checked_out;
	
	public Book(String name, boolean checked_out){
		this.name = name;
		this.checked_out = checked_out;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public synchronized void checkout(String stud_name){
		boolean did_wait = false;
		while(this.isChecked_out()){
			if(!did_wait){
				System.out.println(stud_name+" needs to wait for "+this.name);
			}
			
			did_wait = true;
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.checked_out = true;;
		System.out.println("Student: "+stud_name+" checked out book: "+this.name);
		
	}
	
	public synchronized void checkIn(String stud_name){
		System.out.println("Student: "+stud_name+" checked in book: "+this.name);
		this.checked_out = false;
		notifyAll();
	}

	public boolean isChecked_out() {
		return checked_out;
	}

	public void setChecked_out(boolean checked_out) {
		this.checked_out = checked_out;
	}
}
