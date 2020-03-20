package isp.lab4.exercise4;

public class FireAlarm {
    private boolean active=false;

    public void FireSensor(boolean active){ this.active=active; }

    public boolean isActive(){return active;}

    public void setActive(){ this.active=active;}

    public String toString(){
        return "FireAlarm{active="+active+"}";
    }
}
