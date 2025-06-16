public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60) {
            this.hour = hour;
            this.minute = minute;
        } else {
            this.hour = 0;
            this.minute = 0;
        }
    }

    public String displayTime() {
        // Format with leading zeros if needed
        return String.format("%02d:%02d", hour, minute);
    }

    public static void main(String[] args) {
        Clock c1 = new Clock(14, 30);
        Clock c2 = new Clock(9, 5);
        Clock c3 = new Clock(25, 70); // invalid time, should default to 00:00

        System.out.println("Clock 1: " + c1.displayTime());
        System.out.println("Clock 2: " + c2.displayTime());
        System.out.println("Clock 3: " + c3.displayTime());
    }
}

