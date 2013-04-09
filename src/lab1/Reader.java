package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Reader {

    public static void main(String[] args) throws IOException {

        File data = new File(File.separatorChar + "Temp" + File.separatorChar + "jordan.txt");

        BufferedReader in = null;
        String s = "";

        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                s = s + line;
                line = in.readLine();  // strips out any carriage return chars
                if (line != null) {
                    s = s + "\r\n";
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

        for (String string : ss) {
            System.out.println(string);
        }



        System.out.println("");
        System.out.println("");
        print2();
        write(data);

    }

    public static void print2() {

        File data = new File(File.separatorChar + "Temp" + File.separatorChar + "jordan.txt");

        BufferedReader in = null;
        String s = "";

        try {
            in = new BufferedReader(new FileReader(data));

            int i = 1;

            String line = in.readLine();
            while (line != null) {
                
                line = in.readLine();  // strips out any carriage return chars
                i++;

                //print the second line of the 
                if (line != null && i == 2) {
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

        for (String string : ss) {
            System.out.println(string);
        }

    }
    
    public static void write(File data) throws IOException{
          boolean append = true;   
	  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));

          out.println("Aqua|Man|123 Ocean Lane|Atlantis|WI|53154|aquaman@gmail.com|434-434-4444");
	  out.close(); 
    
    
    }
    
    
    
}
