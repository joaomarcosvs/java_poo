import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Salário base: ");
        double salbase = scanner.nextDouble();

        double grat = salbase*0.05;
        double imp = salbase*0.07;

        double salariof = salbase + grat - imp;

        System.out.println("Salário Final: "+salariof);
    }
}
