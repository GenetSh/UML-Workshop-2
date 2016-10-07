/**
 * 
 */
package boatPackage;

import java.util.ArrayList;

/**
 * @author kuku
 *
 */
public class Member {
	private String name;
	private String personalNumber;
	private String uniqId; 
	private ArrayList <Boat> boatList;
	private MemberIdGenerator rand;
	private String output;
	private Authentication authenticateMember;
	
	public Member(String name, int pNum) throws Exception{
		this.personalNumber =""+ pNum;
		authenticateMember = new Authentication();
		
		if(authenticateMember.emptyString(name) && authenticateMember.checkPersonalNumber(personalNumber)){
			
			this.name = name;
			this.personalNumber =""+ pNum;
			rand = new MemberIdGenerator();
			this.uniqId =""+ rand.getNum();
			boatList = new  ArrayList<Boat>();
		}
		else{
			if(!authenticateMember.emptyString(name)){
				System.out.println("System_MSG/Member: One simply can not have an empty name");
				throw new Exception();
				}
			else{
				System.out.println("System_MSG/Member: are you tripping !!! 10 digits personal number!!nigggaaaaaaaaaaaa");
				throw new Exception();
			}
		}
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) throws Exception {
		if(!authenticateMember.emptyString(name)){
			System.out.println("System_MSG/Member: One simply can not have an empty name");
			throw new Exception();
		}
		
			this.name = name;			
		
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) throws Exception {
		if(!authenticateMember.checkPersonalNumber(personalNumber)){
			System.out.println("System_MSG/Member: Gotchyyaaaaa!! \ndescription :10 digits for personal number");
			throw new Exception();
		}
		
		this.personalNumber = personalNumber;
	}

	public String getUniqId() {
		return uniqId;
	}

	public void setUniqId(String uniqId) {
		this.uniqId = uniqId;
	}

	public ArrayList<Boat> getBoatList() {
		return boatList;
	}
	
	public void addBoat(Boat newBoat){
		for (int i=0;i<boatList.size();i++){
			if(newBoat.isEqual(boatList.get(i))){
				System.out.println("Systrem_MSG/Member: Again ??? Lolzzzz!! one can  not add the same boat two times in this system");
			}
		}
		boatList.add(newBoat);
		
	}
	public void removeBoat(Boat boatToDel) throws Exception{
		for (int i=0; i<boatList.size(); i++ ){
			if(boatList.get(i).isEqual(boatToDel)){
				boatList.remove(i);
				return ;
			}
		}
		System.out.println("System_MSG/Member: How can one delete a boat if it does not exist");
		throw new Exception();

	}
	public String toString(){
		int counter =1;
		output = "Members Name = "+this.name + 
				 "\nMembers Personal Number =  "+this.personalNumber +
				 "\nMembers Id = "+this.uniqId+
				 "\nBoats:\n";
		for(int  i=0;i<boatList.size();i++){
			output += "\tBoat "+counter+++" :"+ boatList.get(i).toString()+"\n";
		
		}
		
		return output;
	}
	
}
