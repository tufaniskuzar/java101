import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir yıl giriniz: ");
        int year = input.nextInt();

        if(year%4==0){
            if(year%100==0&&year%400!=0){
                System.out.printf("%d artık yıl değildir.",year);
            }
            else {
                System.out.printf("%d artık yıldır.",year);
            }
        }
        else {
            System.out.printf("%d artık yıl değildir.",year);
        }

    }
}