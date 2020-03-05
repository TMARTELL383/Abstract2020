package bsu_comp152;

public class CommissionEmployee extends Employee {
    private int numberOfSales;
    public static final double commission = 100;

    public CommissionEmployee(){
        numberOfSales = 0;
    }
    public void makeSale(){
        numberOfSales++;
    }
    @Override
    public double calculateBiWeeklyPay(){
        var pay = 1000 + numberOfSales*commission;
        numberOfSales = 0; //after paying commission
        return pay;
    }
}