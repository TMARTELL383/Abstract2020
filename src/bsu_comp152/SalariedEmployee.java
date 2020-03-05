package bsu_comp152;

import java.io.File;

public class SalariedEmployee extends Employee implements Logger{
    private double yearlySalary;
    public SalariedEmployee(double salary){
        yearlySalary = salary;
    }
    public void writeLogging(String toLog){
        File logFile = new File(Logger.DEFAULT_FILE_NAME);
        if(!logFile.canWrite()){
            System.out.println("Could not log");
        }
    }
    public String toString(){
        return "salaried employee with a yearly salary of " + yearlySalary;
    }
    public double calculateBiWeeklyPay(){
        return yearlySalary/26;
    }
}


//We want to make sure a function is not overridden.
//Interfaces = promise of functionality
