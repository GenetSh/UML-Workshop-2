package boatPackage;

public class Authentication {

	public boolean emptyString(String input) throws Exception{
		int counter=1;
		int anotherCounter = 0;
		for(int i = 0;i<input.length();i++){
			char c = input.charAt(i);
			if(c==' '){
				counter++;
			}
			else{
				anotherCounter++;
			}
		}
		 if(counter>anotherCounter){
			 System.out.println("System_MSG/Authentication: you should atleast have one character and try to avoid spaces");
			 throw new Exception();
		 }
		 
				return true;
	}
	public boolean checkPersonalNumber(String personalNumber){
		
		if(personalNumber.length()==10)
			return true;
		
		return false;
	}
	 
}
