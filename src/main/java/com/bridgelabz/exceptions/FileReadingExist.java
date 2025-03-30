package com.bridgelabz.exceptions;

import java.io.*;

public class FileReadingExist {
    public static void main(String[] args) {
        {
            try{
                // Attempt to read the file

                BufferedReader reader= new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\bridgelabz-workspace\\java-exception\\src\\main\\java\\com\\bridgelabz\\exceptions\\data.txt"));
                String line;
                while((line=reader.readLine()) != null){
                    System.out.println(line);

                }
                System.out.println("File found!");
            }catch(IOException e){  // Handles file not found or reading error
                System.out.println("File not Found");
            }
        }
    }
}
