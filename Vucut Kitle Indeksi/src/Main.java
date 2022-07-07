import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double m,kg,sonuc;
    Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        m = inp.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz :");
        kg = inp.nextDouble();

        sonuc = kg / (m * m);
        System.out.print("Vucut Kitle Indeksiniz :" + sonuc);


    }
}
