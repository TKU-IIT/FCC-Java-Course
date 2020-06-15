package java;

public class MyTime24 implements MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime24() {
    }
    public MyTime24(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return this.hour;
    }
    public void setHour(int hour) {
        if (hour<0 || hour>=24) {
            throw new IllegalArgumentException("Invalid hour "+hour);
        }
        this.hour = hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public void setMinute(int minute) {
        if (minute<0 || minute>=60) {
            throw new IllegalArgumentException("Invalid minute "+minute);
        }
        this.minute = minute;
    }
    public int getSecond() {
        return this.second;
    }
    public void setSecond(int second) {
        if (second<0 || second>=60) {
            throw new IllegalArgumentException("Invalid second "+second);
        }
        this.second = second;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    @Override
    public boolean equals(Object o){
        // implement
        if(o instanceof MyTime24){
            MyTime24 t1 = (MyTime24) o;
            return (this.toString().equals(t1.toString()));
        }else{
            return false;
        }
    }
    @Override
    public int getSecondOfDay() {
        return hour*3600+minute*60+second;
    }
    @Override
	public void addSeconds(int seconds){
        // implement
        if(seconds >= 86400){
            seconds = seconds - 86400;
        }else if(seconds < 0){
            seconds = seconds + 86400;
        }
        hour = hour + (seconds/3600);
        minute = minute + ((seconds%3600)/60);
        second = second + (((seconds%3600)%60));
    }
}
