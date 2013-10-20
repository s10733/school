package zadanie2;

public class Stypendyst extends Person {

	private int grant;
	
	protected String showDetails(){
		String details;
		details = "Kwota stypendium to: " + this.grant + " z³";
		return details;
		
	}
	
	public void setGrant(int grant){
		this.grant = grant;
	}
	
	public int getGrant(){
		return grant;
		
	}
}
