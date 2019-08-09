package BasicIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BassicFile {

	public static void main(String[] args)  {
		File file = new File("Record.txt");
		
		  try { PrintWriter output = new PrintWriter(file); 
		  output.println("Abinaya");
		  output.println(24); 
		  output.close();
		  } 
		  catch(IOException ex)
		  {
		  System.out.println("Error:%s \n");
		  }
		 
try {
	Scanner input = new Scanner(file);
	String name = input.nextLine();
	int age = input.nextInt();
	System.out.printf("Name:%s,Age:%d \n",name,age);
}
catch(FileNotFoundException ex) {
	System.out.println("Error:%s \n");

	
}


}
	
}	
	
