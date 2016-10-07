/**
 * 
 */
package boatPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author kuku
 *
 */

public class BoatFetcher {
	
	
	private File file;
	private String data;
	public void singleBoatFetcher(){
		file = new File("D:\\Boat\\kuku's_Boat.txt");
		try {
			Scanner scan = new Scanner(file);
			data=scan.nextLine();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println("Sys_msg/BoatFetcher : File not found,...");
		}
	}
		
}
	
	
