package fileReadingAndWriting;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class printWriterPratice {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PrintWriter outFile = new PrintWriter(new FileWriter("printing.txt"));//,true));
		//outFile.println("Hello World");
		String temp = JOptionPane.showInputDialog("enter a sentence, type STOP to stop");
		
		while(!temp.equals("STOP"))
		{
			outFile.println(temp);
			temp = JOptionPane.showInputDialog("enter a sentence, type STOP to stop");
		}
		outFile.close();
	}

}
