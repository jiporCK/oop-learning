package abstraction;

public abstract class SmartDevice implements Wifi, BlueTooth {

    public void turnOn() {
        System.out.println("Device is turned on");
    }

    public void turnOff() {
        System.out.println("Device is turn off");
    }

}
