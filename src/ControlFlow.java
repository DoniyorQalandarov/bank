import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner son = new Scanner(System.in);
        System.out.println("Son kiriting");
        int raqam  = son.nextInt();
        if (raqam < 10) {
            System.out.println("Error number");
        }
        else {
            System.out.println("True number");
        }
    }
}
