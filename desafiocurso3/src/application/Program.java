package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.print("Numeros negativos: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0) {
                System.out.print(vet[i] + ", ");
            }
        }

        sc.close();
    }
}
