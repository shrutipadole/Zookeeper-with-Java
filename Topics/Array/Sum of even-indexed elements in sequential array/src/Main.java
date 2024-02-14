import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Code to get user input
        int n = scanner.nextInt();

        // Declare and initialize your int array here
        int[] arr = new int[n];


        // Write your logic to populate the array with integers starting from 1
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        // Compute the sum of even-indexed elements in the array
        int sum=0;
        for(int i=0;i<n;i=i+2){
            sum = (int)sum+arr[i];
        }

        // Print out the sum
        System.out.println(sum);
        // Do not forget to close the Scanner
        scanner.close();
    }
}