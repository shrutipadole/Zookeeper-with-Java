import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int org = num;
        int rev = 0;
        int rem;
        while(num>0){
            rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }
        if (org==rev){
            System.out.println(1);
        } else {
            System.out.println(45);
        }
    }
}