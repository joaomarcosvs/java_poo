package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangulo X Area: %.4f%n", areaX);
        System.out.printf("Triangulo Y Area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.print("Maior area é a do X");
        }else{
            System.out.print("Maior area é a do y");
        }

        sc.close();
    }
}
