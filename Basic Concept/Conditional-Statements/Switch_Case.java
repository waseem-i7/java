import java.util.*;

public class Switch_Case{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Button 1");
            break;
            case 2 : System.out.println("Button 2");
            break;
            case 3 : System.out.println("BUtton 3");
            break;
            default: System.out.println("Invalide Button");;
            break;
        }
    }
}