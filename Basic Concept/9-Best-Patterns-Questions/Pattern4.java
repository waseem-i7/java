public class Pattern4 {
    public static void main(String[] args) {
        //Q.4 print the pattern
        // ****
        // ***
        // **
        // *

        int n =4 ;

        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=i; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}
