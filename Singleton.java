package com.company;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Singleton {
    private static Singleton instance = new Singleton();
    private FileReader fileReader;
    private FileWriter fileWriter;

    private Singleton() {}

    {
        try{
            fileReader = new FileReader("file.txt");
            fileWriter = new FileWriter("file.txt", true);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static Singleton getInstance(){
        return instance;
    }

    public void read() {
        try {
            int character;

            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String word) {
        try {
            fileWriter.write(word);
            fileWriter.write("\r\n"); // write new line
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
