package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws IOException {

	int lineRead = 2;



	File data = new File(File.separatorChar + "Temp" + File.separatorChar + "jordan.txt");

	BufferedReader in = null;
	String s = "";

	try {
	    in = new BufferedReader(new FileReader(data));

	    int i = 1;
	    String line = in.readLine();

	    if (i == lineRead) {
		s = s + line;
	    }


	    while (line != null) {
		line = in.readLine();  // strips out any carriage return chars
		i++;

		//print the second line of the 
		if (i == lineRead) {
		    s = s + line;
		}
	    }


	} catch (IOException ioe) {
	} finally {
	    try {
		in.close();
	    } catch (Exception e) {
	    }
	}

	String[] ss;
	ss = s.split("\\|");
	
	System.out.println(ss[3].toString());
	
	}

    }

