package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{
	public static void scaryPopup() {
		JOptionPane.showMessageDialog(null, "You have triggered a critical error in your computer...");
		
	}
	public static void testPositive(int num) throws NegativeNumberException {
		if(num < 0) {
			throw new NegativeNumberException();
		}
	}
	public static void main(String[] args) {
		try {
			testPositive(-3);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			scaryPopup();
		} 
		finally {
			JOptionPane.showMessageDialog(null, "Your computer will be okay!");
		}
	}
}
