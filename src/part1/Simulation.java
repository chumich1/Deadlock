package part1;

public class Simulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library library = new Library();
		Student stud1 = new Student("Matthew", library);
		Student stud2 = new Student("Mark", library);
		
		stud1.start();
		stud2.start();

	}

}
