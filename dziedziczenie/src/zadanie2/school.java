package zadanie2;

public class school {

	public static void main(String[] args) {
		
		Student student = new Student();
		Student student1 = new Student();
		Stypendyst stypend = new Stypendyst();
		
		student.setName("�ukasz");
		student.setSurname("Dzwonkowski");
		student.setSex("M�czyzna");
		student.setDate("1989-11-30");
		student.setIndexNr(10733);
				
		
		student1.setName("Adam");
		student1.setSurname("Kowalski");
		student1.setSex("M�czyzna");
		student1.setDate("1991-12-01");
		student1.setIndexNr(10222);
	
		
		System.out.println("Student 1:\n ");
		System.out.println("Imi�: " + student.getName());
		System.out.println("Nazwisko: " + student.getSurname());
		System.out.println("P�e�: " + student.getSex());
		System.out.println("Data urodzenia: " + student.getDate());
		System.out.println("Numer indeksu: " + student.getIndexNr());
		
		
		System.out.println("\nStudent 2:\n ");
		System.out.println("Imi�: " + student1.getName());
		System.out.println("Nazwisko: " + student1.getSurname());
		System.out.println("P�e�: " + student1.getSex());
		System.out.println("Data urodzenia: " + student1.getDate());
		System.out.println("Numer indeksu: " + student1.getIndexNr());
		
		
		stypend.setName("Katarzyna");
		stypend.setSurname("Kowalska");
		stypend.setSex("kobieta");
		stypend.setDate("1984-05-06");
		stypend.setGrant(500);
	
		
		System.out.println("\nStypendysta:\n ");
		System.out.println("Imi�: " + stypend.getName());
		System.out.println("Nazwisko: " + stypend.getSurname());
		System.out.println("P�e�: " + stypend.getSex());
		System.out.println("Data urodzenia: " + stypend.getDate());
		System.out.println( stypend.showDetails());
		
	}

	
}
