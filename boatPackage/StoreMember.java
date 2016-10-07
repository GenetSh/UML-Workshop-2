
package boatPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
  

public class StoreMember extends DataManager {
	private File memberFile;
	private String[] memberList;
	private String path;
	public StoreMember(String pathIn) {
		super(pathIn);
		// TODO Auto-generated constructor stub
		if(memberFile.exists() ){
			memberList = memberFile.list();
		}
		else{
			System.out.println("Member file was not found!\n Member file has been created, please ty again!");
			memberFile.mkdir();
		}
	}

	

	public boolean storeSingleMember(Member newMember) throws IOException{
		for(String x: memberList){
			if(x.equals(newMember.getName()+".txt")){
				System.out.println("Member already exist!");
				return false;
			}
		}
		
		
		/*create a text file by the name of the member
		  then we will save the members information on the text by the form
		 * 
		 * MemberId,MemberName,MemberPersonalNumber, NumberOfBoats
		 * 
		 */
		
		super.memberFile.setWritable(true);
		String writer= newMember.getUniqId()+","+newMember.getName()+","+newMember.getPersonalNumber()+","+newMember.getBoatList().size()+",\n";
		try(FileWriter fw = new FileWriter(super.memberFile, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
				{
				
		    	out.println(writer);
		    	System.out.println("Member "+newMember.getName()+" is registered!");
			} catch (IOException e) {
		    	System.out.print("sys_msg/StoreMember : ERROR!"  );
			}
		
		return true;
	}
}
