package isp.lab4.exercise3;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ControllerTest {
    TemperatureSensor Sensor1 = new TemperatureSensor(55,"Room1");
    FireAlarm Alarm1 = new FireAlarm();
    Controller Controller1 = new Controller(Sensor1,Alarm1);
    @Test
    public void ControllerTest(){
        assertEquals("Temperature should be 55",55,Sensor1.getValue());
        assertEquals("Alarm should be inactive",false,Alarm1.isActive());
    }

    @Test
    public void ControlStepTest(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Controller1.controlStep();
        assertEquals("Fire alarm should be started","Fire alarm started\r\n",outContent.toString());
    }
}
