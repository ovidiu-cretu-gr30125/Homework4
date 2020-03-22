package isp.lab4.exercise4;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ControllerTest {
    TemperatureSensor[] temperatureSensors  = new TemperatureSensor[3];
    FireAlarm Alarm1 = new FireAlarm();
    @Test
    public void ControlStepTest(){
        temperatureSensors[0] = new TemperatureSensor(5,"Room0");
        temperatureSensors[1] = new TemperatureSensor(10,"Room1");
        temperatureSensors[2] = new TemperatureSensor(15,"Room2");
        Controller Controller = new Controller(temperatureSensors, Alarm1);
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Controller.controlStep();
        assertEquals("Fire alarm should be off!","Fire alarm not started\r\n",outContent.toString());
    }
}
