import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double min = 20;
        Scanner input = new Scanner(System.in);

        System.out.println("How many kilometer did you travel by taxi ? ");
        double km= input.nextDouble();

        double fee = 2.20*km;

        if(fee<20){
            System.out.println("The fee is "+min+" Turkish Liraas.");
        }
        else{
            System.out.printf("The fee is %.2f Turkish Liraas.%n", fee);

        }



    }
}