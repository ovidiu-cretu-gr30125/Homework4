package isp.lab4.exercise3;


public class Controller {

    private TemperatureSensor temperatureSensor;

    private FireAlarm fireSensor;

    public void controlStep(){
        if(temperatureSensor.getValue()>50){
            fireSensor.FireSensor(true);
            System.out.println("Fire alarm started");
        }
        else{
            System.out.println("Fire alarm not started");
        }
    }

    public Controller(TemperatureSensor temperatureSensor,FireAlarm fireSensor){
        this.temperatureSensor=temperatureSensor;
        this.fireSensor=fireSensor;
    }

}
