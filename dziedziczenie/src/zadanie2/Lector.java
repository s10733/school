package zadanie2;

public class Lector  extends Person {

	private String title;
	

	@Override
	protected String showDetails() {
	String detalis;
	detalis =" Tytu³ lektora:  " + this.title;
	return detalis;
	
	}
	
	public String title(){
		return title;
		
	}
}
