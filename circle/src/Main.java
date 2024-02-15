import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz :");
        double yaricap = input.nextDouble();

        double pi=3.14;
        double cevre = 2*pi*yaricap;
        double alan = pi*yaricap*yaricap;

        System.out.printf("Dairenin cevresi %.2f ve alani %.2f'dir.\n",cevre,alan);

        System.out.println("Dairenin merkez aci olcusunu veriniz :");
        double dilimaci = input.nextDouble();
        double dilim = (pi*(yaricap*yaricap)*dilimaci)/360;

        System.out.printf("Acisi %.2f olan dilimin alani %.2f'dir.",dilimaci,dilim);
    }
}