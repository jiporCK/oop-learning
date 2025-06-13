package abstraction;

public class SmartWatch extends SmartDevice {

    @Override
    public void connectToBlueTooth() {
        System.out.println("Smart watch is connected to bluetooth");
    }

    @Override
    public void disConnectFromBlueTooth() {
        System.out.println("Smart watch is disconnected to bluetooth");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Smart watch is connected to wifi");
    }

    @Override
    public void disConnectFromWIfi() {
        System.out.println("Smart watch is disconnected to wifi");
    }
}
