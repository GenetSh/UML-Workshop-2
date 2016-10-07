
package boatPackage;

import java.io.File;
import java.util.Scanner;


public class MainBoat {

	/**
	 * @param args
	 * @throws Exception 
	 */
	private static 	StoreBoat rr;
	private static Scanner scan;
	public static void main(String[] args) throws Exception {
		/*
		 
		 * scan = new Scanner(System.in);
		  *System.out.print("Insert path: ");
		String path= scan.nextLine();
		File temp = new File(path);*/
		DataManager aaa= new DataManager("c:\\");
		
		
		System.out.println(aaa.getConnection());
		Member kuku = new Member("abel",1356789559);
		rr= new StoreBoat("c:\\");
		Boat sinorita = new Boat(kuku,"jk",16);
		rr.storeSingleBoat(sinorita);
		
		StoreMember y= new StoreMember("c:\\");
		y.storeSingleMember(kuku);
		System.out.println(kuku);
		/*
		x.storeSingleBoat(sinorita);
		System.out.println(sinorita);
		BoatFetcher fetcher = new BoatFetcher();
		fetcher.singleBoatFetcher();
		MemberFetcher fetchMember = new MemberFetcher();
		fetchMember.singleMemberFetcher();*/
	}
	

}
