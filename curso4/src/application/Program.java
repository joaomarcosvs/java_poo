package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nome = sc.next();
            System.out.println("Digite o preco dos produto: ");
            double preco = sc.nextDouble();
            vect[i] = new Product(nome, preco);

            soma += vect[i].getPreco();
        }

        double media = soma / n;

        System.out.println("A media e: " + media);

        sc.close();
    }
}
