package ticketTester;
import javax.swing.*;

public class ticketTester {
	public static void main(String[] args) {
		int noEntry = 0;
		int entry = 0;
		int count = 0;
		
		while(count != 5)
		{
			int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age to see if allowed entry, 19 minimum"));
			if(age > 18) {
				System.out.println(age + ": Entry");
				entry++;
			}
			if(age <= 18) {
				System.out.println(age + ": No Entry");
				noEntry++;
			}
			count++;
		}
		System.out.println(noEntry + " are Not allowed entry");
		System.out.println(entry + " are allowed entry");
		System.out.println((entry*20) + " % of tester made it into the program");
	}
}
