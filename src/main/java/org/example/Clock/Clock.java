package org.example.Clock;

public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours (int hours) {
        this.hours = hours;
    }

    public void setMinutes (int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds (int seconds) {
        this.seconds = seconds;
    }

    public int getHours () {
        return this.hours;
    }

    public int getMinutes () {
        return this.minutes;
    }

    public int getSeconds () {
        return this.seconds;
    }

    public void tick () {
        int sek = getSeconds() + 1;
        setSeconds(sek);
    }


    @Override
    public void readTime() {
        System.out.println("Заданное время " + this.hours + ":" + this.minutes + ":" + this.seconds);
    }
}
