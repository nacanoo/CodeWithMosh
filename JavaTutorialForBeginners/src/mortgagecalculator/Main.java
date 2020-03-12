package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = input.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte period = input.nextByte();
        short numberOfPayments = (short) (period * MONTHS_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest*Math.pow((1+monthlyInterest),numberOfPayments))
                / (Math.pow((1+monthlyInterest), numberOfPayments) - 1);
        System.out.print("Mortgage: ");
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
