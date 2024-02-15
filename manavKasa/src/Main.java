import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Meyve fiyatları
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlıcanFiyat = 5.00;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut kaç kilogram? ");
        double armutKg = scanner.nextDouble();
        System.out.println("Elma kaç kilogram? ");
        double elmaKg = scanner.nextDouble();
        System.out.println("Domates kaç kilogram? ");
        double domatesKg = scanner.nextDouble();
        System.out.println("Muz kaç kilogram? ");
        double muzKg = scanner.nextDouble();
        System.out.println("Patlıcan kaç kilogram? ");
        double patlıcanKg = scanner.nextDouble();

        double toplamTutar = armutKg * armutFiyat +
                elmaKg * elmaFiyat +
                domatesKg * domatesFiyat +
                muzKg * muzFiyat +
                patlıcanKg * patlıcanFiyat;

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        scanner.close();
    }
}
