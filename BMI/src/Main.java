import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Boyunuzu giriniz: ");
       double boy = input.nextDouble();
       System.out.println("Kilonuzu giriniz: ");
       double kilo = input.nextDouble();

       double bmi = kilo/(boy*boy);
       System.out.printf("Vucut kitle indeksiniz %.2f'dir.",bmi);

    }
}