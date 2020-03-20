package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String [] args) {
        TemperatureSensor[] temperatureSensors = new TemperatureSensor[3];
        temperatureSensors[0] = new TemperatureSensor(5,"Room0");
        temperatureSensors[1] = new TemperatureSensor(10,"Room1");
        temperatureSensors[2] = new TemperatureSensor(15,"Room2");
        FireAlarm Alarm1 = new FireAlarm();
        Controller Controller = new Controller(temperatureSensors, Alarm1);
        Controller.controlStep();
    }
}
