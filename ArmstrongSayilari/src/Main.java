import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int temp;
        int sum = 0;

        while (sayi!=0){
            temp=sayi%10;
            sum+=temp;
            sayi=sayi/10;
        }
        System.out.println(sum);
        /*sayı girilecek
        sayının kaç basamaklı olduğu bulunacak
         */

    }
}