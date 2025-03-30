package com.bridgelabz.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosing {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\bridgelabz-workspace\\java-exception\\src\\main\\java\\com\\bridgelabz\\exceptions\\info.txt"))) {
            System.out.println(reader.readLine()); // Reading the first line
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

}