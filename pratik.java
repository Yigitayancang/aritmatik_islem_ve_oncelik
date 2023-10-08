import java.util.Scanner;
public class pratik {
    public static void main(String[] args) {
        int a ,b, c ;
        Scanner inp = new Scanner(System.in);
        System.out.print("BİRİNCİ SAYIYI GİRİNİZ : ");
        a = inp.nextInt();
        System.out.print("İKİNCİ SAYIYI GİRİNİZ : ");
        b = inp.nextInt();
        System.out.println("ÜÇÜNCÜ SAYIYI GİRİNİZ : ");
        c = inp.nextInt();
        int sonuc = a +(b * c)-c;
        System.out.println("SONUÇ : " + sonuc);
    }
    
}