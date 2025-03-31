import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Peso 1: ");
        double peso1 = scanner.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Peso 2: ");
        double peso2 = scanner.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Peso 3: ");
        double peso3 = scanner.nextDouble();

        double media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
        System.out.println("A média é: " + media);
    }
}