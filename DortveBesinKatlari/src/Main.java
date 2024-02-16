import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();

        for(int i=0;i<number;i++){
            if(i%4==0||i%5==0){
                System.out.println(i);
            }
        }
    }
}