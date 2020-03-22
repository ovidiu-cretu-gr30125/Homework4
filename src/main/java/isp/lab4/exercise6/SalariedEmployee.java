package isp.lab4.exercise6;

public class SalariedEmployee extends  Employee{
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary,String fistName,String lastName){
        super(fistName,lastName);
        this.weeklySalary=weeklySalary;
    }

    public double getPaymentAmount(){
        return 4*weeklySalary;
    }
}
