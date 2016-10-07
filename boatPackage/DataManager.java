
package boatPackage;

import java.io.File;
import java.io.IOException;

public class DataManager {
		protected String path="";
		private File file;
		protected File memberFile;
		protected File boatFile;
		protected String connection=""; 
		protected File fileIn;
		
		public DataManager(String pathIn){
			
			boatFile = new File(pathIn);
			memberFile = new File(pathIn);
			fileIn = new File(path);
			this.path = pathIn;
			connect();
}
		
		public void connect(){
			if(fileIn.exists() &&  fileIn.isDirectory()){
				System.out.println("connecting...");
				file= new File(path+"\\file");
				file.mkdir();
				this.path =file.getPath();
				memberFile =new File(path+"\\MEMBER.txt");
				if(!memberFile.exists())
					try {
						memberFile.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				boatFile =new File(path+"\\BOAT.txt");
				if(!boatFile.exists())
					try {
						boatFile.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
			else{
				connection="Boat file was not found";
				
			}
		}

		public String getConnection() {
		return connection;
		
}
		public void setConnection(String connection) {
			this.connection = connection;
		}
}
		