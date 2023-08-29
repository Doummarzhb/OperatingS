/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

 
class  filename   extends Thread{
         
    private final String filename;

    public filename (String filename) {
        this.filename=filename;
    }

        @Override
    public void run(){
        int value = (int) Math.pow(10, 6);
        int max = (int) Math.pow(10, 9);
        try  {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            Random random = new Random();
            for (int i = 0; i < value; i++) {
                int randomInt = random.nextInt(max) + 1;
                writer.write(String.valueOf(randomInt));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
