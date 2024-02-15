import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Birinci sayiyi giriniz: ");
       double number1 = input.nextDouble();
       System.out.println("İkinci sayiyi giriniz: ");
       double number2 = input.nextDouble();

       System.out.println("1.Toplama\n2.Çıkartma\n3.Çarpma\n4.Bölme\nHangi islemi yapmak istersiniz ?");
       int islem = input.nextInt();

       switch (islem){
           case 1:
               System.out.println(number1+number2);
           case 2:
               System.out.println(number1-number2);
           case 3:
               System.out.println(number1*number2);
           case 4:
               if(number2!=0){
                   System.out.println(number1/number2);
               }
               else {
                   System.out.println("Payda 0 olamaz.");
               }
       }

    }
}