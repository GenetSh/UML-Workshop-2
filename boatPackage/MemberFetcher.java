
package boatPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MemberFetcher {
	
	private File file;
	private String data;
	public void singleMemberFetcher(){
		file = new File("D:\\Members\\kuku.txt");
		try {
			Scanner scan = new Scanner(file);
			data=scan.nextLine();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println("Sys_msg/MemberFetcher : File not found,...");
		}
	}
		
}
