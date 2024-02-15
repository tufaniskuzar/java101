import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        int matematik=0,fizik=0,turkce=0,kimya=0,muzik=0;


        System.out.println("Matematik notunuzu giriniz :");
        int temp = input.nextInt();
        if(temp>=0&&temp<=100){
            matematik=temp;
            counter++;
        }
        System.out.println("Fizik notunuzu giriniz :");
        temp = input.nextInt();
        if(temp>=0&&temp<=100){
            fizik=temp;
            counter++;
        }
        System.out.println("Turkce notunuzu giriniz :");
        temp = input.nextInt();
        if(temp>=0&&temp<=100){
            turkce=temp;
            counter++;
        }
        System.out.println("Kimya notunuzu giriniz :");
        temp = input.nextInt();
        if(temp>=0&&temp<=100){
            kimya=temp;
            counter++;
        }
        System.out.println("Müzik notunuzu giriniz :");
        temp = input.nextInt();
        if(temp>=0&&temp<=100){
            muzik=temp;
            counter++;

        double ortalama=(matematik+fizik+turkce+kimya+muzik)/counter;
        System.out.printf("Ortalama %.2f'dir.",ortalama);
        if(ortalama>55){
            System.out.println("Gectiniz.");
        }
        else {
            System.out.println("Kaldiniz.");
        }

        }
    }
}