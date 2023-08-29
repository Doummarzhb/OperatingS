/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tmax  extends Thread {
    
    private String filename;
    private int max=0;
    public int getMax() {
        return max;
    }
    public Tmax(String filename) {
        this.filename = filename;
    } 
    public void run()  {
 
   String line;
        try {
             BufferedReader  reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null) {
               
                int value = Integer.parseInt(line);

                if (value > max) {
                    max = value;
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Tmax.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

