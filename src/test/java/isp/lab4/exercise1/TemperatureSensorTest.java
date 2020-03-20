package isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperatureSensorTest {
    TemperatureSensor Sensor1 = new TemperatureSensor(30,"Room1");
    @Test
    public void TemperatureSensorTest(){
        assertEquals("Temperature should be 30",30,Sensor1.getValue());
        assertEquals("Location should be Room1","Room1",Sensor1.getLocation());
    }
    @Test
    public void getValueTest(){
        assertEquals("Temperature should be 30",30,Sensor1.getValue());
    }
    @Test
    public void getLocationTest(){
        assertEquals("Location should be Room1","Room1",Sensor1.getLocation());
    }
    @Test
    public void toStringTest(){
        assertEquals("The temperature of the Room1 is {30}","TemperatureSensor{value=30,location=Room1}",Sensor1.toString());
    }
}
