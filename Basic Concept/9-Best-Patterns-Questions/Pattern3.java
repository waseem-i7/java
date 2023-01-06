public class Pattern3 {
    public static void main(String[] args) {

        //Q.3 print the pattern
        // *
        // **
        // ***
        // ****
        int n = 4 ; //row 

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                 if(j<=i){
                    System.out.print("*");
                 } 
            }
            System.out.println();
        }
    }
}
