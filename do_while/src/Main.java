import javax.xml.transform.stream.StreamSource;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        char resposta = 's';

        do {
            System.out.println("Digite a temperatura em celsius: ");
            double c = scan.nextDouble();
            double fr = ((9*c)/5) + 32;
            System.out.println("Equivalente em fahrenheit: " + fr);
            System.out.println("Deseja repetir (s/n)?");
            resposta = scan.next().charAt(0);

        } while (resposta == 's');

        scan.close();
    }
}