package FizzBuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number % 5 == 0)
            System.out.print("Fizz");
        if (number % 3 == 0)
            System.out.print("Buzz");
        if (number % 5 != 0 && number % 3 != 0)
            System.out.println(number);

        // Mosh
        System.out.print("Number: ");
        int num = input.nextInt();

        if (num % 5 == 0 && num % 3 == 0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);


    }
}
