package isp.lab4.exercise6;

public class ComissionEmployee extends Employee {
    private double grossSales;

    private double comissionSales;

    public ComissionEmployee(double grossSales,double comissionSales,String firstName,String lastName){
        super(firstName,lastName);
        this.grossSales=grossSales;
        this.comissionSales=comissionSales;
    }

    public double getPaymentAmount(){
            return grossSales-comissionSales;
    }
}
