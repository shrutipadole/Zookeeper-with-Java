import java.util.Scanner;

public class Main {
    // Method 1: This method will compute the product of two numbers.
    static int product(int num1, int num2) {
        // Write your code here.
        return num1*num2;
    }

    // Method 2: This method will compute the average of two numbers
    // and round it down to the nearest whole number.
    static int average(int num1, int num2) {
        // Write your code here.
        return (int) Math.floor((double)(num1+num2)/2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Call the methods here and print the result.
        System.out.println(product(num1, num2));
        System.out.println(average(num1, num2));
    }
}