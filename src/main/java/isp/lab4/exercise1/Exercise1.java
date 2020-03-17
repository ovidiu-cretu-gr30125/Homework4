package isp.lab4.exercise1;

public class Exercise1 {
    public static void main(String []args) {
        TemperatureSensor Sensor1 = new TemperatureSensor(20,"Motor");
        System.out.println(Sensor1.getLocation());
        System.out.println(Sensor1.getValue());
        System.out.println(Sensor1.toString());
    }
}
