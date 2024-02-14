import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int max = 0;
        int nxt;
        while(scanner.hasNext()){
            nxt = scanner.nextInt();
            if(nxt > max  && nxt%4==0){
                max = nxt;
            }
        }
        System.out.println(max);
    }


}