package bsu_comp152;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var allEmployees = new ArrayList<Employee>();
        Employee emp = new CommissionEmployee();
        emp.calculateBiWeeklyPay();
        allEmployees.add(emp);
        emp = new SalariedEmployee(55000);
        allEmployees.add(emp);
        //in real life we would have more data
        for (var payee:allEmployees){
            System.out.println("Paying " + payee + " a paycheck of " + payee.calculateBiWeeklyPay());
        }
    }
}
