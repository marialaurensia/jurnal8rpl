package com.company;
import java.util.Scanner;
public class no1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" inputan : ");
        int input = scan.nextInt();
        int a = 1, b = 1, c, i , jumlah = input;
        System.out.print(a +" "+b );
        for (i = 2; i < jumlah ; i++ ){
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}

