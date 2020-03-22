package isp.lab4.exercise6;

public class HourlyEmployee extends  Employee{
    private double wage;

    private double hours;

    public HourlyEmployee(double wage,double hours,String firsName,String lastName){
        super(firsName,lastName);
        this.wage=wage;
        this.hours=hours;
    }

    public double getPaymentAmount(){
           return hours*wage;
    }
}
