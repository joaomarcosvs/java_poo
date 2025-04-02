package application;

import util.CurrecyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preco do dollar? ");
        double preco = sc.nextDouble();

        System.out.println("Quantos dolares voce deseja comprar?");
        double compra = sc.nextDouble();

        double total = CurrecyConverter.conversacao(preco, compra);

        System.out.println("Total de dollars: " + total);

        sc.close();
    }
}
