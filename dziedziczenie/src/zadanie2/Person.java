package zadanie2;

 abstract class Person  {
	
	protected String name;
	protected String surname;
	protected String sex;
	protected int data;
 
 	public final String show(){
 		
 		String details ;
 		details="Name:"+this.name;
 		details="Surname"+this.surname;
 		details="sex"+this.sex;
 		details="data"+this.data;
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
 	
 	public String setSex(){
 	 		return sex;
 	}
 	
 	public int getDate(){
 		return data;
 	}
 	
 	 		





}
	







