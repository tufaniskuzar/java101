import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz: ");
        int ay = input.nextInt();
        System.out.println("Doğduğunuz günü giriniz: ");
        int gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun < 22) {
                    System.out.println("Siz oğlak burcusunuz.");
                } else {
                    System.out.println("Siz kova burcusunuz.");
                }
                break;
            case 2:
                if (gun < 20) {
                    System.out.println("Siz kova burcusunuz.");
                } else {
                    System.out.println("Siz balık burcusunuz.");
                }
                break;
            case 3:
                if (gun < 21) {
                    System.out.println("Siz balık burcusunuz.");
                } else {
                    System.out.println("Siz koç burcusunuz.");
                }
                break;
            case 4:
                if (gun < 21) {
                    System.out.println("Siz koç burcusunuz.");
                } else {
                    System.out.println("Siz boğa burcusunuz.");
                }
                break;
            case 5:
                if (gun < 22) {
                    System.out.println("Siz boğa burcusunuz.");
                } else {
                    System.out.println("Siz ikizler burcusunuz.");
                }
                break;
            case 6:
                if (gun < 23) {
                    System.out.println("Siz ikizler burcusunuz.");
                } else {
                    System.out.println("Siz yengeç burcusunuz.");
                }
                break;
            case 7:
                if (gun < 23) {
                    System.out.println("Siz yengeç burcusunuz.");
                } else {
                    System.out.println("Siz aslan burcusunuz.");
                }
                break;
            case 8:
                if (gun < 23) {
                    System.out.println("Siz aslan burcusunuz.");
                } else {
                    System.out.println("Siz başak burcusunuz.");
                }
                break;
            case 9:
                if (gun < 23) {
                    System.out.println("Siz başak burcusunuz.");
                } else {
                    System.out.println("Siz terazi burcusunuz.");
                }
                break;
            case 10:
                if (gun < 23) {
                    System.out.println("Siz terazi burcusunuz.");
                } else {
                    System.out.println("Siz akrep burcusunuz.");
                }
                break;
            case 11:
                if (gun < 22) {
                    System.out.println("Siz akrep burcusunuz.");
                } else {
                    System.out.println("Siz yay burcusunuz.");
                }
                break;
            case 12:
                if (gun < 22) {
                    System.out.println("Siz yay burcusunuz.");
                } else {
                    System.out.println("Siz oğlak burcusunuz.");
                }
                break;
            default:
                System.out.println("Geçersiz ay girdiniz.");
        }
    }
}
