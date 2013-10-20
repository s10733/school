package zadanie2;

 abstract class Person  {
	
	protected String name;
	protected String surname;
	protected String sex;
	protected String date;
 
 	public final String show(){
 		
 		String details ;
 		details="Name:"+this.name;
 		details="Surname"+this.surname;
 		details="sex"+this.sex;
 		details="data"+this.date;
 		details+=showDetails();
 		
 		return details;
 	}
 	
 	protected abstract String showDetails() ;
 	
 	
 	public String getName(){
 			return name;
 			
 	}
 	public void setName(String name){
			this.name = name;
 		
			
	}
 	
 	public String getSurname(){
 		return surname;
 		
 	}
 	
 	public void setSurname(String surname){
 		this.surname= surname;
 	}
 	
 	public void setSex(String sex){
 	 		 this.sex= sex;
 	}
 	
 	public String getSex(){
 		return sex;
 	}
 	
 	public void setDate(String date){
 		this.date = date ;
 	}
 	public String getDate(){
 		return date;
 	}
 	
 	 		





}
	







