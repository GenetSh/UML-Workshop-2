
package boatPackage;


public class Boat {


	private MemberIdGenerator rand;
	private String boatsUniqueId;
	private String type;
	private String output;
	private String ownersMemberName;
	private Authentication authenticate;
	
	private double length;
	
	public Boat(Member owner, String typeIn, double lengthIn){
		rand = new MemberIdGenerator();
		boatsUniqueId = ""+ rand.getNum();
		authenticate = new Authentication();
		ownersMemberName = owner.getName();
		type = typeIn;
		length = lengthIn;
	}
	
	public String getOwnersMemberName() {
		return ownersMemberName;
	}

	public void setOwnersMemberName(String ownersMemberName) {
		this.ownersMemberName = ownersMemberName;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) throws Exception {
		if(authenticate.emptyString(type)){
			this.type = type;
		}
		
		else{
			System.out.println("System_MSG/Boat: Your boat gotta have a name atleast(other than a space) ");
			throw new Exception();
		}
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) throws Exception{
		if(length<=0){
			System.out.println("System_MSG/Boat: seriously !! is that the length of your boat !!!! ");
			throw new Exception();
		}
		this.length = length;
	}
	
	public boolean isEqual(Boat boatToCompare){
		return this.boatsUniqueId== boatToCompare.boatsUniqueId;
	}
	public String toString(){
		output="Boat id = "+this.boatsUniqueId +", Boat Type = "+this.type+", Boats Length = "+ this.length;
		return output;
	}
}
