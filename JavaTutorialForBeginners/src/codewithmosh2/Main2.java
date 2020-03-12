package codewithmosh2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        // Chaining
        String result1 = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result1);

        // Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        scanner.nextLine();
        System.out.println("You are " + age);

        System.out.print("Name: ");
        // String name = scanner.next(); // Só pega a primeira palavra
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
