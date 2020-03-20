package isp.lab4.exercise3;

public class Exercise3 {
    public static void main (String [] args){
        TemperatureSensor Sensor1 = new TemperatureSensor(55,"Room1");
        FireAlarm Alarm1 = new FireAlarm();
        Controller Controller1 = new Controller(Sensor1,Alarm1);
        Controller1.controlStep();
    }
}
