import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class if_else {
    public static void main(String[] args) {
        
        //first program
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age > 18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not Adult");
        // }

        //second program
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // if(x%2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }

        //Third program
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    

        if(a==b){
            System.out.println("equal");
        }else if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
    }
}
