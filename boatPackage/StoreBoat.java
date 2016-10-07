
package boatPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class StoreBoat extends DataManager{
	private File boatFile;
	private String[] boatList;
	public String path;
	
	public StoreBoat(String pathIn) {
		super(pathIn);
		
	}
	
	public boolean storeSingleBoat(Boat newBoat) throws IOException{
			super.boatFile.setWritable(true);
			String writer= newBoat.getOwnersMemberName()+","+newBoat.getType()+","+newBoat.getLength()+",\n";
		try(FileWriter fw = new FileWriter(super.boatFile, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
				{
				
		    	out.println(writer);
		    	System.out.println("Boat for "+newBoat.getOwnersMemberName()+" is registered!");
			} 
			catch (IOException e) {
		 
		 	  System.out.print("sys_msg/StoreBoat: ERROR!");
		 	 
			}	
		
		return true;
	}
}
