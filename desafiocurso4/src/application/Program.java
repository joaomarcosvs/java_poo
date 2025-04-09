package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent r = new Rent("Maria", "mariagz@gmail.com");

        System.out.println(r);

        sc.close();
    }
}