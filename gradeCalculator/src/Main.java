import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int math, physics, chemistry, turkish, history, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Math grade :");
        math = input.nextInt();

        System.out.print("Enter your Physics grade :");
        physics = input.nextInt();

        System.out.print("Enter your Chemistry grade :");
        chemistry = input.nextInt();

        System.out.print("Enter your Turkish grade :");
        turkish = input.nextInt();

        System.out.print("Enter your History grade :");
        history = input.nextInt();

        System.out.print("Enter your Music grade :");
        music = input.nextInt();

        int average = (math + physics + chemistry + turkish + history + music) / 6;


        switch (average / 10) {
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
                break;
        }

    }
}