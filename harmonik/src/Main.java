import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        double sum = 0;

        for(int i=1;i<=sayi;i++){
            sum+=(1.0/i);
        }
        System.out.println(sum);
    }
}