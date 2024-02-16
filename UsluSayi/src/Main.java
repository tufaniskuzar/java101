import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı giriniz : ");
        int number = input.nextInt();
        int us = input.nextInt();


        for(int i=1;i<us;i++){
            number=number*number;
        }

        System.out.println(number);
    }
}