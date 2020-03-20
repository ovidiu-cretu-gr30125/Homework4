package isp.lab4.exercise5;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HouseTest {
    @Test
    public void HouseTest(){
        TemperatureSensor[] temperatureSensor = new TemperatureSensor[3];
        temperatureSensor[0] = new TemperatureSensor(60,"Room0");
        temperatureSensor[1] = new TemperatureSensor(70,"Room1");
        temperatureSensor[2] = new TemperatureSensor(80,"Room2");
        FireAlarm FireAlarm1 = new FireAlarm();
        Controller Controller1 = new Controller(temperatureSensor,FireAlarm1);
        House House1 = new House(Controller1);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        House1.getController().controlStep();
        assertEquals("Alarm should be on","Fire alarm started\n",outContent.toString());
    }
}
