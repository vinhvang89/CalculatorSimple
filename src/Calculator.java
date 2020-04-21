
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter x :");
            double x = scan.nextDouble();
            System.out.println("Enter y :");
            double y = scan.nextDouble();
            calculate(x,y);
        }
        catch (InputMismatchException e){
            System.out.println("Nhập cũng méo xong ");
        }
    }
    public static void calculate(double x,double y) {
        try {
            double a = x + y;
            double b = x - y;
            double c = x * y;
            double d = x / y;
            System.out.println("x + y : " + a);
            System.out.println("x - y : " + b);
            System.out.println("x * y : " + c);
            System.out.println("x / y : " + d);

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
