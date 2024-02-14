import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Your code here
        if(number==0){
            System.out.println("Zero");
        } else if(number<0){
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        scanner.close();
    }
}