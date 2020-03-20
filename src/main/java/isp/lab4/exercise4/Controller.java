package isp.lab4.exercise4;


public class Controller {
    private TemperatureSensor temperatureSensors [] = new TemperatureSensor[3];

    private FireAlarm fireSensor;

    public void controlStep(){
        int numberOfSensorsActivated=0;
        for(int i=0;i<=2;i++) {
            if (temperatureSensors[i].getValue() > 50) {
                fireSensor.FireSensor(true);
                 numberOfSensorsActivated++;
            }
        }
            if(fireSensor.isActive()==true&& numberOfSensorsActivated==3 ) {
                System.out.println("Fire alarm started");
            }
            else {
                System.out.println("Fire alarm not started");
            }

    }

    public Controller(TemperatureSensor [] temperatureSensors, FireAlarm fireSensor){
        for(int i=0;i<=2;i++) {
            this.temperatureSensors[i] = temperatureSensors[i];
        }
        this.fireSensor=fireSensor;
    }
}
