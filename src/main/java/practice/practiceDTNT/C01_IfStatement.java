package practice.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Mubarek Gun" ;
        Eger gun cumartesi ise "Yahudiler Icin Kutsal Gun"
        Eger gun pazar ise "Hristiyanlar Icin Kutsal Gun" yazdıran kodu oluşturunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun = input.next().toLowerCase();//kucuk harfe cevirdik
        if(gun.equals("cuma")){
            System.out.println("Muslumanlar Icin Kutsal Gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal Gun");
        } else if (gun.equals("pazar")){
            System.out.println("Hristiyanlar icin Kutsal Gun");
        } else
            System.out.println("Kutsal Gun Degil");

    }

}
