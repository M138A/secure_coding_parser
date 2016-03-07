/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresr;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author M. Hartgring
 */
public class Paresr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        List<Account> accounts;
        boolean running = true;
        while (running) {
            System.out.println("Path to file:");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            FileReader x = new FileReader("C:\\HaxLogs.txt");
            BufferedReader bf = new BufferedReader(x);
            String thisLine;
            
            while ((thisLine = bf.readLine()) != null) {
                Account account = new Account();
                String[] parts = thisLine.split("\\s");
                account.setName(parts[0]);
                
                
            }
            System.out.println("Parse another file? Y/N");
            String repeat = in.nextLine();
            if (repeat.equals("N")) {
                running = false;
            }
        }
    }

}
