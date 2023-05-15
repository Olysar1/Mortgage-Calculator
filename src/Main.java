import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/100/12;

        System.out.print("Period(years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * 12;

        double result = principal * (monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments)) / (Math.pow(1+monthlyInterest, numberOfPayments)-1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedResult = currency.format(result);

        System.out.println("Your monthly payment will be " + formattedResult);

    }
}