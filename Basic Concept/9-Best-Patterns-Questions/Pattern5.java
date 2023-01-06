public class Pattern5 {
    public static void main(String[] args) {
        //Q.5 print the pattern
        //    *
        //   **
        //  ***
        // ****
        int n = 4 ;
        
        //outer loop
        for(int i=1 ; i<=n ; i++){

            //inner loop -> print spaces
            for(int j=1 ; j<=n-i ; j++)
             System.out.print(" ");
            
            //outer loop -> print star 
            for(int j=1 ; j<=i ; j++) {
             System.out.print("*");
            }
            System.out.println();
        }
    }
}
