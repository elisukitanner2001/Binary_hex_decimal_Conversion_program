
public class RunHere {

	public static void main(String[] args) {
		//added hex to binary functionality
		BinPower binpower = new BinPower();
		binpower.setBinary();
		
		HexDecbin baseConverter = new HexDecbin();
		baseConverter.setHexNumber();
		baseConverter.convert();
		
	}

}
