

public class Pattern1 {
    public static void main(String[] args) {
        
        //Q.1) Print the Pattern
        // * * * *
        // * * * *
        // * * * *
        // * * * *

        int n = 4 ;
        int m = 5;

        //outer loop
        for(int i=0 ; i<n ; i++){
            //inner loop
            for(int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
