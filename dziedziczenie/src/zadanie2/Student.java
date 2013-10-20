package zadanie2;

public class Student extends Person  {

	
	private int indexNR;
	
	
	
	@Override
	protected String showDetails() {
	String details;
	details =" Numer indeksu:  " + this.indexNR ;
	return details;
	
	}	
	
		public void setIndexNr(int index)
	{
		this.indexNR =index;
	}
	
		public int getIndexNr(){
			return indexNR;
		}




	
	
}
