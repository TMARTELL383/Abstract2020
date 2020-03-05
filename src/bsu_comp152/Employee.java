package bsu_comp152;

public abstract class Employee {
    public abstract double calculateBiWeeklyPay();
    public void withholdTaxes(){
        System.out.println("We are withholding " + calculateBiWeeklyPay() + "from your paycheck");
    }
    public final void fileW2Forms(){
        System.out.println("That is one copy for you and one for the IRS");
    }
}