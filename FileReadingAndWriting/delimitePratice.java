package fileReadingAndWriting;
import java.util.*;

public class delimitePratice {
	public static void main(String[] args) {
		String line = "number#45#john";
		
		Scanner sc = new Scanner(line).useDelimiter("#");
		
		//String word = sc.next();
		//int num = sc.nextInt();
		
		int count = 0;
		while(sc.hasNext())
		{
			String temp = sc.next();
			count++;
		}
		sc.close();
		System.out.println(count);
		//System.out.println(word + "\n" + num);
	}
}
