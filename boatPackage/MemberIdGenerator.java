/**
 * 
 */
package boatPackage;

/**
 * @author kuku
 *
 */
public class MemberIdGenerator {

	private String num;

	public String getNum() {
		num = ""+ System.nanoTime();
		return num;
	}
}
