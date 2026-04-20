
class MyThread implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}

  


// @nd program

import java.io.*;
public class Filecopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            FileOutputStream fos = new FileOutputStream("out.txt");
              
            int data;
            while((data = fis.read()) != -1) {
                fos.write(data);
            }
            nn
            fis.close();
            fos.close();
            System.out.println("File copied\n");
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}