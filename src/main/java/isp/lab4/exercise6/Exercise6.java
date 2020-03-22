package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String [] args) {
        Employee Employee1 = new ComissionEmployee(12.5, 1.5, "Ovidiu", "Cretu");
        System.out.println(Employee1.getPaymentAmount());
        Employee Employee2 = new HourlyEmployee(10.25, 102.5, "Ovidiu", "Cretu");
        System.out.println(Employee2.getPaymentAmount());
        Employee Employee3 = new SalariedEmployee(175.60, "Ovidiu", "Cretu");
        System.out.println(Employee3.getPaymentAmount());
        Employee[] Employee = new Employee[6];
        Employee[0] = new ComissionEmployee(12.5, 1.5, "Ovidiu", "Cretu");
        Employee[1] = new ComissionEmployee(15.6, 5.5, "Ovidiu", "Cretu");
        Employee[2] = new SalariedEmployee(325.5,"Ovidiu","Cretu");
        Employee[3] = new SalariedEmployee(445.5,"Ovidiu","Cretu");
        Employee[4]= new HourlyEmployee(223.4,100.5,"Ovidiu","Cretu");
        Employee[5]= new HourlyEmployee(123.4,100,"Ovidiu","Cretu");
        double totalPayment=0.0;
        for (int i=0;i<6;i++){
            totalPayment=totalPayment+Employee[i].getPaymentAmount();
        }
        System.out.println(totalPayment);
    }
}
