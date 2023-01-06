package Loops;
import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
      
        // int i = 12;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);


        //Q.1) sum of n natural number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // for(int i = 1; i<=n ; i++){
        //     sum = sum+i;
        // }
        // System.out.println(sum);

        //Q.2 write program to print the table of a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1 ; i<=10 ; i++){
            System.out.println(n*i);
        }
        
    }
}
