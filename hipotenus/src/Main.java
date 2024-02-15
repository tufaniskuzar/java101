import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first side of rectangular : ");
        double x = input.nextDouble();
        System.out.println("Enter second of rectangular : ");
        double y = input.nextDouble();

        double hipotenus = Math.sqrt(x*x+y*y);
        System.out.println("The hipotenus is "+hipotenus);
    }
}