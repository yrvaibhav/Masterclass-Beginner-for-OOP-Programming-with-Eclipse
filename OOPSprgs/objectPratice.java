package oOPSprgs;
import javax.swing.*;

public class objectPratice {
	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog("Enter the file name");
		read test = new read();
		test.readFile(fileName);
		test.process();
		System.out.println(test.printResult());
	}
}
