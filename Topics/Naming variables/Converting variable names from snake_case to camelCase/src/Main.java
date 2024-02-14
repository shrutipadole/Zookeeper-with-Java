import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Take string input using Scanner object
        String snakeCaseString = scan.nextLine();
        // You can initialize an empty string for storing the camelCase result
        StringBuilder camelCaseString = new StringBuilder();

        // TODO: Write a loop through each character in the snakeCaseString
        for(int i=0; i<snakeCaseString.length(); i++){
            char ch = snakeCaseString.charAt(i);
            if (ch == '_'){
                ch = snakeCaseString.charAt(i+1);
                ch = Character.toUpperCase(ch);
                camelCaseString.append(ch);
                i = i+1;
                continue;
            }
            camelCaseString.append(ch);
        }
        // If the character is '_', skip to the next iteration and convert the next character to upper case
        // Else, just add the character to camelCaseString

        // After the loop, print the camelCaseString
        System.out.println(camelCaseString);
    }
}