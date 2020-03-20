package isp.lab4.exercise2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FireAlarmTest {
    FireAlarm Alarm1 = new FireAlarm();

    @Test
    public void FireSensorTest(){
        Alarm1.FireSensor(true);
        assertEquals("Alarm status should be true",true,Alarm1.isActive());
    }
    @Test
    public void setActiveTest(){
        Alarm1.setActive();
        assertEquals("Alarm status should be false",false,Alarm1.isActive());
    }
    @Test
    public void toStringTest(){
        assertEquals("FireAlarm{active=false}",Alarm1.toString());
    }
}
