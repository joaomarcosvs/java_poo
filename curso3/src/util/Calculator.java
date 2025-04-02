package util;

public class Calculator {

    // Se o objeto for static eu não preciso instancia-lo
    public static double PI = 3.14159; //Isso é uma constante!

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3.00;
    }
}
