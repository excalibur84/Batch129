package Scanner4;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {


        //  Kullanıcıdan ad, ikinci ad, soyadı, SSN'yi alın ve ardından aşağıdaki gibi yazdırın

        //Ali Mert Can
        //kkno:123456789

        Scanner input =new Scanner(System.in);
        System.out.println("Adinize Giriniz Lutfen : ");

        String isim = input.next();

        System.out.println("IkinciIsmnize Lutfen : ");

        String ikinciIsim = input.next();


        System.out.println(" SoyIsim Lutfen : ");

        String soyIsim = input.next();

        System.out.println("Kimlik Kart No Lutfen : ");

        int kkno = input.nextInt();


        System.out.println(isim + " "+ikinciIsim + " "+soyIsim);

        System.out.println("Kkno : "+kkno);



    }
}