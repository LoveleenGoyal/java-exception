package com.bridgelabz.exceptions;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = {10, 20, 30, 40, 50};
            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            try {
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();
                System.out.println("Result: " + (arr[index] / divisor));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}

/*Enter index: 8
Enter divisor: 0
Invalid array index!*/