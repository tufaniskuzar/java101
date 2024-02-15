import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int number1 = input.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        int number2 = input.nextInt();
        System.out.println("Üçüncü sayiyi giriniz: ");
        int number3 = input.nextInt();

        if(number1>number2 && number1>number3){
            if (number2>number3){
                System.out.println("num1>num2>num3");
            }
            if (number3>number2){
                System.out.println("num1>num3>num2");
            }
        }
        if(number2>number1 && number2>number3){
            if (number1>number3){
                System.out.println("num2>num1>num3");
            }
            if (number3>number1){
                System.out.println("num2>num3>num1");
            }
        }
        if(number3>number2 && number3>number1){
            if (number2>number1){
                System.out.println("num3>num2>num1");
            }
            if (number1>number2){
                System.out.println("num3>num1>num2");
            }
        }
    }
}