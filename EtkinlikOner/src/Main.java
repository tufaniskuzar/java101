import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz.");
        int sicaklik = input.nextInt();
        if(sicaklik<=5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (sicaklik>5&&sicaklik<15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik>=15&&sicaklik<25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (sicaklik>=25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }


}