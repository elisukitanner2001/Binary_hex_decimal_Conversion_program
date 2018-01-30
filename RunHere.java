
public class RunHere {
/*Grading requirments
 * 1 all jops, remove/comment out scanner, syso
 * runnable jar -- stand alone outside of eclipse
 * 3 ask for name and repeat name with friendly hello
 * 4 ask what base we are starting with, Hex, Dec or Bin
 * 5 ask what base we are convertng to 
 * 6 do the conversion, display the result
 * 7 do the conversion, display the result
 */
	public static void main(String[] args) {
	//	added hex to binary functionality
		BinPower binpower = new BinPower();
		binpower.setBinary();
		
		HexDecbin baseConverter = new HexDecbin();
		baseConverter.setHexNumber();
		baseConverter.convert();
		
	}
}
