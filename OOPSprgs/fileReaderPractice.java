package oOPSprgs;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class fileReaderPractice {
	public static void main(String[] args) {
		String filename = JOptionPane.showInputDialog("Enter your file name");
		scannerPratice fileReader =new scannerPratice();
		fileReader.fileScan(filename);
	}
}