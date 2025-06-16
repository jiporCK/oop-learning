package exercise.exercise5;

public class Clock {
    private int hour;
    private int minute;

    public Clock(){}
    public Clock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public void DisplayTime()
    {
        if(hour <= 0 || hour > 23)
        {
            hour = 0;
        }
        if(minute <= 0  || minute > 59)
        {
            minute = 0;
        }

        System.out.printf("%02d:%02d",hour,minute);
        System.out.println();

    }
}
