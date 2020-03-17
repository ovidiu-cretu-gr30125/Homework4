package isp.lab4.exercise1;

public class TemperatureSensor {

        private int value;

        private String location;

        public TemperatureSensor(){ }

        public TemperatureSensor(int value,String location){
            this.value=value;
            this.location=location;
        }

        public int getValue(){
            return value;
        }

        public String getLocation(){
            return location;
        }

        public String toString(){
            return "The temperature of the "+getLocation()+" is {"+getValue()+"}";
        }
}
