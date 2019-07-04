package fileReadingAndWriting;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tryAndCatch {
	public static void main(String[] args) {
		try
		{
		Scanner scFile = new Scanner(new File("names.txt"));//if we remove the file from the folder then it will go to catch
		
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
		catch(FileNotFoundException e)
		{
			System.out.println("It's all broken");
		}
}
}
