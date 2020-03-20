package isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String [] args){
        TemperatureSensor[] temperatureSensor = new TemperatureSensor[3];
        temperatureSensor[0] = new TemperatureSensor(20,"Room0");
        temperatureSensor[1] = new TemperatureSensor(22,"Room1");
        temperatureSensor[2] = new TemperatureSensor(21,"Room2");
        FireAlarm FireAlarm1 = new FireAlarm();
        Controller Controller1 = new Controller(temperatureSensor,FireAlarm1);
        House House1 = new House(Controller1);
        House1.getController().controlStep();
    }
}
