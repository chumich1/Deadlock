package part2;

public class Simulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library library = new Library();
		Student stud1 = new AmbitiousStudent("Matthew", library,0);
		Student stud2 = new AmbitiousStudent("Mark", library,1);
		Student stud3 = new AmbitiousStudent("Luke", library,2);
		
		stud1.start();
		stud2.start();
		stud3.start();
		try {
			stud1.join();
			stud2.join();
			stud3.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
