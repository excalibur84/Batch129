package day07ifstatements;

import  java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        if(num>0){
            System.out.println("Pozitif...");

        }else if(num<0) {
            System.out.println("Negatif...");

        }else{
            System.out.println("Notr");

            }
        }

    }




