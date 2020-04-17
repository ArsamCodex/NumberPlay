package NumberPlay;

import java.util.Scanner;

public class App {

    private static int repeat(long n , int m){
        int count = 0;
        while (n > 0){
            if((n % 10) == m){
                count++;

            }
            n /=10;
        }
        return count;
    }

    public static void main ( String [] args){
        long n;
        int m ;
        System.out.print("Enter n");
        n = new Scanner(System.in).nextLong();
        System.out.print("Enter m");
        m = new Scanner (System.in ).nextInt();
        System.out.printf("%1$s Repeat %2$s times" ,m , repeat(n,m));
    }
}
