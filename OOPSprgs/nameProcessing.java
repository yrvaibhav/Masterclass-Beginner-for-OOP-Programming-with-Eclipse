package oOPSprgs;
import javax.swing.*;

public class nameProcessing {
	public static void main(String[] args) {
		process name = new process();
		String temp = JOptionPane.showInputDialog("Enter your full name");
		System.out.println(name.processName(temp));
	}
	
}
