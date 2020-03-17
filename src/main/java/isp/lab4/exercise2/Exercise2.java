package isp.lab4.exercise2;

public class Exercise2 {
    public static void main (String [] args){
        FireAlarm Alarm1 = new FireAlarm();
        Alarm1.FireSensor(true);
        System.out.println(Alarm1.isActive());
        System.out.println(Alarm1.toString());
    }
}
