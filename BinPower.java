import java.util.Scanner;

import javax.swing.JOptionPane;

public class BinPower {
	//Fixed scanner bug for float inputs
	Scanner input = new Scanner(System.in);
	
		
	public BinPower() {
		
		
	}
	public void setBinary() {
		
		double exp;
		double base;
		int ans = 2;
		double answer;
		String name = "";
		String msg ="";
		//ans = 2^exp;-
		//does not work
		msg ="Hello human. What shall I call you?";
		
		name = JOptionPane.showInputDialog(msg);
		msg = "Thanks for using my glorious program " + name;
		JOptionPane.showMessageDialog(null, msg);
		System.out.println("Please enter a Base number");
		base = input.nextDouble();
		System.out.println(name + " You have entered: "+ base);
		System.out.println("Please enter a Binary exponent");
		exp = input.nextDouble();
		System.out.println(name + " You have entered: "+ exp);
		// (int) type casting
		answer =  Math.pow(base, exp);
		System.out.println("Answer is: " + answer);
	}
}
