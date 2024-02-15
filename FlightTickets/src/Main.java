import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        int mesafe = input.nextInt();
        System.out.println("Yasinizi giriniz: ");
        int yas = input.nextInt();
        System.out.println("Yolculuk tipiniz giriniz ---> (1-Tek yön;2-Gidiş dönüş)");
        int tip = input.nextInt();

        double normalbilet = mesafe*0.10;
        double indirim = 0;
        double indirimlitutar = 0;
        if(yas<12){
            indirimlitutar=normalbilet/2;
            if(tip==2){
                indirimlitutar=(8*indirimlitutar/10)*2;
                System.out.println("Bilet tutarınız hesaplanıyor.\n--------------------------------");
                System.out.printf("Bilet tutarı %.2f'dir.",indirimlitutar);
            }
            else {
                System.out.println("Bilet tutarınız hesaplanıyor.\n--------------------------------");
                System.out.printf("Bilet tutarı %.2f'dir.",indirimlitutar);
            }
        }
        if(yas>=12&&yas<=24){
            indirimlitutar=9*normalbilet/10;
            if(tip==2){
                indirimlitutar=(8*indirimlitutar/10)*2;
                System.out.println("Bilet tutarınız hesaplanıyor.\n--------------------------------");
                System.out.printf("Bilet tutarı %.2f'dir.",indirimlitutar);
            }
            else {
                System.out.println("Bilet tutarınız hesaplanıyor.\n--------------------------------");
                System.out.printf("Bilet tutarı %.2f'dir.",indirimlitutar);
            }
        }
        if(tip==2&&yas>24){
            normalbilet=(8*normalbilet/10)*2;
            System.out.println("Bilet tutarınız hesaplanıyor.\n--------------------------------");
            System.out.printf("Bilet tutarı %.2f'dir.",normalbilet);
        }


    }
}