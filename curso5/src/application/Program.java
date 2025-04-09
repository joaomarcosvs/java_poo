package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Joao");
        list.add("Mauricio");
        list.add(2, "Joao Marco");

        System.out.println(list.size());

        list.remove("Bob");

        System.out.println("-------");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------");

        System.out.println("Index of Joao: " + list.indexOf("Joao"));
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("-------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        sc.close();
    }
}
