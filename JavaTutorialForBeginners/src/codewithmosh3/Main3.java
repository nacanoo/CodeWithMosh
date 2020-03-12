package codewithmosh3;

public class Main3 {

    public static void main(String[] args) {

        // Comparison Operators
        int x = 1;
        int y = 2;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<=y);

        // Logical Operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

        // If Statements
        int temp = 2;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        // Simplifying If Statements
        /*
        int income = 120_000;
        boolean hasHighincome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;

        // or
        boolean hasHighincome = false;
        if (income > 100_000)
            hasHighIncome = true;

        // Better option
        boolean hasHighIncome = (income > 100_000);
         */

        // The Ternary Operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

        // Switch Statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        if (role == "admin")
            System.out.println("You're an admin");
        else if (role == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");

        int rolee = 1;
        switch (rolee) {
            case 1:
                System.out.println("You're an admin");
                break;
            case 2:
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }



    }
}
