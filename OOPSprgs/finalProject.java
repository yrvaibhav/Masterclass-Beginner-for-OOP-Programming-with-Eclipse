package oOPSprgs;
import javax.swing.*;

public class finalProject {
	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog("Enter the name of the text file");
		Reader test =new Reader(fileName);
		test.findOld();
		test.process();
		test.printtofile();
	}
}
