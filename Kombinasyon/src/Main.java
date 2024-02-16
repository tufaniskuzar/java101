import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kombinasyon formülündeki N ve R'yi sırayla giriniz.");
        int n = input.nextInt();
        int r = input.nextInt();
        int nfak = 1;
        int rfak = 1;
        int nrfak = 1;

        for(int i=1;i<=n;i++){
            nfak=nfak*i;
        }

        for(int i=1;i<=r;i++){
            rfak=rfak*i;
        }

        for(int i=1;i<=(n-r);i++){
            nrfak=nrfak*i;
        }

        System.out.println(nfak/(rfak*nrfak));
    }
}