package lab1;

import java.io.*;

public class TextReaderApp{
	
   public static void main(String[] args) {

	File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "test.txt");

        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    } 
} 
