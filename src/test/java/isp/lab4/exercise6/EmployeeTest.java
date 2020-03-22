package isp.lab4.exercise6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void ComissionEmployeeTest(){
            Employee EmployeeComission = new ComissionEmployee(200.50,100.66,"Ovidiu","Cretu");
            assertEquals("Payment amount should be 99.84",99.84,EmployeeComission.getPaymentAmount(),0.001);
    }
    @Test
    public void HourlyEmployeeTest(){
        Employee EmployeeHourly = new HourlyEmployee(10.25,300,"Ovidiu","Cretu");
        assertEquals("Payment amount should be 3075",3075,EmployeeHourly.getPaymentAmount(),0.001);
    }
    @Test
    public void SalariedEmployeeTest(){
        Employee EmployeeSalaried = new SalariedEmployee(250.50,"Ovidiu","Cretu");
        assertEquals("Payment amount should be 1002",1002,EmployeeSalaried.getPaymentAmount(),0.001);
    }
}
