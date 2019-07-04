package fileReadingAndWriting;
import java.util.*;
import java.io.*;

public class marksResultsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scFile = new Scanner(new File("marks.txt"));
			while(scFile.hasNext())
			{
				String line = scFile.nextLine();
				Scanner scLine = new Scanner(line).useDelimiter("#");
				String first = scLine.next();
				String last = scLine.next();
				double mark = scLine.nextDouble();
				boolean pass = scLine.nextBoolean();
				scLine.close();
				
				PrintWriter outFile = new PrintWriter(new FileWriter("results.txt", true));
				outFile.println(first.charAt(0) + ". " + last + " " + mark + "% " + pass);
				outFile.close();
			}
			scFile.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch(IOException f)
		{
			System.out.println("File not found for print");
		}
	}

}
