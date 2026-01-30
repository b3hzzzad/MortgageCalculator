package Verion2;

public class Mortgage_V2 {
    public static void main(String[] args) {
        var consoleInput = new ConsoleInput();
        int loan = consoleInput.readInt("Enter loan: ");
        double annualInterest = consoleInput.readDouble("Enter Annual Interest: ");
        int years = consoleInput.readInt("Enter years: ");


        var calculateMortgage = new CalculateMortgage(loan, years, annualInterest);
        System.out.println("Monthly payment: " + calculateMortgage.monthlyPayment());

        int numberOfPayment = years * 12;

        for (int i = 1; i <= numberOfPayment; i++) {
            double balance = calculateMortgage.remainingBalance(i);
            System.out.println(balance);

        }
    }


}
