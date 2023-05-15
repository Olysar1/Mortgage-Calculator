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
        int period = scanner.nextInt();
    }
}