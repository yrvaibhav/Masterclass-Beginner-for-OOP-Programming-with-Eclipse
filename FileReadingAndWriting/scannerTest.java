package fileReadingAndWriting;
import java.util.*;
import javax.swing.*;

public class scannerTest {
	public static void main(String[] args) {
		/*String line = "Hello 40 2.5 true";
		
		Scanner sc = new Scanner(line);
		String word = sc.next();
		int num = sc.nextInt();
		double dNum = sc.nextDouble();
		boolean b = sc.nextBoolean();
		sc.close();
		
		System.out.println(word + "\n" + num + "\n" + dNum + "\n" + b);
		*/
		
		String lines =JOptionPane.showInputDialog("Enter the full name and age");
		Scanner sc1 = new Scanner(lines);
		String first = sc1.next();
		String last = sc1.next();
		int num = sc1.nextInt();
		sc1.close();
		
		System.out.println(first + "\n" + last + "\n" + num);
	}
}
