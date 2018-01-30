import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JOptionPane;
public class HexDecbin {
	//scanner for float working
	//Fix faults!!!!! COMPLETE MISSING CODE
	
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	String msg = "";
	int num;	
	
	public HexDecbin() {
		msg = "Welcome to my Hexidecimal, decimal, or Binary conversion program";
		JOptionPane.showMessageDialog(null, msg);
		msg = "What is your name";
		name = JOptionPane.showInputDialog(msg);
		msg="Very nice to meet you"+ name + " let's begin: \n";
		JOptionPane.showMessageDialog(null, msg);
	}
	public void setHexNumber() {
		
		System.out.println("\nEnter the hex number :");
		hex = kbd.nextLine();
		
	
		num= Integer.parseInt(hex, 16);
		System.out.println("You have entered hex" + hex);
		System.out.println("Decimal value is: " + num + "(remember 0-" + num + "has" + (num+1) + "values)");
		
		
	}
	void convert() {
		
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary value is: " + binary);
		System.out.println("number of bits is: " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is x" + "with y bits left over");
		System.out.println("Number of whole bytes (8 bits) is x" + "with y bits remaining");
		
		
	}
	
	
}
