package zadanie2;

public class Student extends Person  {

	
	private String indexNR;
	
	
	
	@Override
	protected String showDetails() {
	String details;
	details =" Numer indeksu:  " + this.indexNR;
	return details;
	
	}
	
		public void SetIndexNr(String index)
	{
		this.indexNR =index;
	}




		
	
	
}
