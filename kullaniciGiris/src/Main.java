import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username = "patika";
        String password = "java101";

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz: ");
        String kullaniciadi = input.nextLine();
        System.out.println("Sifrenizi giriniz: ");
        String sifre = input.nextLine();

        if(username.equals(kullaniciadi)&&password.equals(sifre)){
            System.out.println("Giris yaptiniz.");
        }
        else{
            System.out.println("Sifre veya kullanici adi hatali.Sifrenizi degistirmek ister misiniz ? E/H");
            String passwordCheck = input.nextLine();
            if (passwordCheck.equals("E")) {
                System.out.println("Yeni sifrenizi giriniz: ");
                String temp = input.nextLine();
                if(temp.equals(password)){
                    System.out.println("Aynı sifreyi girdiniz. ");
                }
                else {
                    password=temp;
                }

            }
            else{
                System.out.println("Tekrar deneyiniz.");
            }
        }


    }
}