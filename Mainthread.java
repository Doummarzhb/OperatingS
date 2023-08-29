/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 public class Mainthread{
  public static void main(String[] args) {
        String[] file = new String[4];
        for(int i=1;i<=4;i++){
            file[i-1] = "file" + i + ".txt";
             filename f=new filename(file[i-1]);   
            f.start();
            try {
                f.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }   

        
        
        Tmax t1 = new Tmax(file[0]);
        Tmax t2 = new Tmax(file[1]);
        Tmax t3 = new Tmax(file[2]);
        Tmax t4 = new Tmax(file[3]);
     
   
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println("Maximum value in " + file [0] + ": " + t1.getMax());
//        System.out.println("Maximum value in " + file [1] + ": " + t2.getMax());
//        System.out.println("Maximum value in " + file [2] + ": " + t3.getMax());
//        System.out.println("Maximum value in " + file [3] + ": " + t4.getMax());
     int overallMax = Math.max(Math.max(t1.getMax(), t2.getMax()), Math.max(t3.getMax(), t4.getMax()));
        System.out.println("Overall maximum integer: " + overallMax);
    }
 }
