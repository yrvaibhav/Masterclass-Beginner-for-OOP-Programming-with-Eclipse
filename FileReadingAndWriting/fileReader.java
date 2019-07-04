package fileReadingAndWriting;
import java.util.*;
import java.io.*;

public class fileReader {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scFile = new Scanner(new File("names.txt"));
		
		String line="" , first="" , second="" ;
		int age = 0;
		
		while(scFile.hasNext())
		{
			line = scFile.nextLine();
			
			Scanner scLine = new Scanner(line).useDelimiter("#");
			
			first = scLine.next();
			second = scLine.next();
			age = scLine.nextInt();
			
			scLine.close();
			
			System.out.println(first + " ." + second.charAt(0) + ". " + age);
		}
		scFile.close();
	}
}
