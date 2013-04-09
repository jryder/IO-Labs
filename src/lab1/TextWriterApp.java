package lab1;

import java.io.*;
import java.util.*;

/**
 * TextWriterApp.java	1.00 Nov 25, 2003
 *
 * A class that writes data to a text file, with buffering.
 */
public class TextWriterApp{
	
   public static void main(String[] args) throws IOException{
   	  boolean append = false;   

	  File data = new File("src/test.out");
	  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));

          
	  out.print(5.25);
	  out.close();  // be sure you close your streams when done!!

   }
}
