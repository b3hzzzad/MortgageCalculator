package Verion2;

public class CalculateMortgage {
    private double loan;
    private int years;
    private double annualInterest;


    public double getLoan() {
        return loan;
    }

    public int getYears() {
        return years;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public CalculateMortgage(double loan, int years, double annualInterest) {
        this.loan = loan;
        this.years = years;
        this.annualInterest = annualInterest;
    }

    public double monthlyPayment() {
        double monthlyInterest = annualInterest / 100.0 / 12.0;
        int numberOfPayments = years * 12;
        return loan
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double remainingBalance(int numberOfPaymentsMade) {
        double monthlyInterest = annualInterest / 100.0 / 12.0;
        int numberOfPayments = years * 12;

        return loan *
                ((Math.pow(1 + monthlyInterest, numberOfPayments) -
                        Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                        /
                        (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

    }

}
