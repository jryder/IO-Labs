package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        System.out.println("What line do you want to read?");
        int lineRead = Integer.valueOf(scan.next());
        
        
        
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
                if (line != null) {
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

    
    
    
}
