package smallstudygroup.Scanner4;

import java.util.Scanner;

public class ForLoopExample {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayı giriniz:");
            int sayi=scan.nextInt();
            for (int i=1;i<=sayi/2;i++)
            {
                if (sayi%i==0){
                    System.out.println(i+ "bir bölendir");
                }
            }

        }
    }

