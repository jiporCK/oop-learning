package abstraction;

public class Demo {

    public static void main(String[] args) {

        SmartDevice smartWatch = new SmartWatch();
        smartWatch.turnOn();
        smartWatch.connectToWifi();
        smartWatch.disConnectFromWIfi();
        smartWatch.connectToBlueTooth();
        smartWatch.disConnectFromBlueTooth();
        smartWatch.turnOff();

    }

}
