package isp.lab4.exercise2;

public class FireAlarm {

    private boolean active=false;

    public void FireSensor(boolean active){ this.active=active; }

    public boolean isActive(){return active;}

    public void setActive(){ this.active=active;}

    public String toString(){
        return "Fire alarm status is "+active+"";
    }
}
