import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("Tek sayı girene kadar sayılar gireceksiniz.");

        do {
            System.out.println("Sayı giriniz: ");
            n = input.nextInt();

            if (n % 4 == 0) {
                sum += n;
            }

        } while (n % 2 == 0);

        System.out.printf("Girilen çift sayılardan 4'e tam bölünenlerin toplamı: %d\n", sum);
    }
}
