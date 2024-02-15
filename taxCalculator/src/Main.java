import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.println("How much money will you pay for this product ?");
       double fee = input.nextDouble();

       System.out.print("The fee without tax is "+fee+"\n");

       if(fee<1000){
           System.out.print("The fee with tax is "+fee*1.18);
       }
       else {
           System.out.print("The fee with tax is "+fee*1.08);
       }
    }
}