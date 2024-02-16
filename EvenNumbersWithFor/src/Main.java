import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int number = input.nextInt();
        int sum = 0;
        int counter = 0;

        for(int i=1;i<number;i++){
            if(i%3==0&&i%4==0){
                sum = sum + i;
                counter = counter + 1;
            }
        }
        System.out.println(sum/counter);
    }
}