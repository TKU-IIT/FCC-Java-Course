package javapractice;
public class MyTime12 implements MyTime {
    public static final String AM = "AM";
    public static final String PM = "PM";
    private int hour = 12;
    private int minute = 0;
    private int second = 0;
    private String period = MyTime12.AM;

    public MyTime12() {
    }
    public MyTime12(int hour, int minute, int second, String peroid) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
        setPeriod(period);
    }

    public int getHour() {
        return this.hour;
    }
    public void setHour(int hour) {
        if (hour<=0 || hour>12) {
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
    public int getSecondOfDay() {
        return hour*3600+minute*60+second;
    }
    @Override
	public void addSeconds(int seconds) {
        //get the seconds of day, and add it by the value of "seconds"
        int sod = getSecondOfDay();
        if(sod==12*3600&&period.equals(AM))
            sod=0;
        sod += seconds;
        //if the result of sod is negative, then make it filled by 24:00:00 (aka 86400sec)
        if(sod < 0)
            sod = 86400 + sod;
        
        hour = sod / 3600;
        minute = (sod - hour*3600) / 60;
        second = (sod - hour*3600 - minute*60);
        //check if this is a valid 24 hour time format
        if (hour >= 24) {
            hour %= 24;
        }
        //Check the situation that hour is in the range of (11<hour<24)
        if (hour / 12 == 1) {
            period = PM;
            if (hour > 12)
                hour -= 12;
        } else {
            //Check the situation that hour is less than 12 
            period = AM;
        }
        //if it is 0 o'clock, then it is 12AM
        if (hour == 0 && period.equals(this.AM)) {
                hour = 12;
        }
        
    }
    @Override
    public String toString() {
        // implement
        return String.format("%02d:%02d:%02d %s", hour,minute,second,period);
    }
    @Override
    public boolean equals(Object o) {
        // implement
        if(this==o)
            return true;
        
        if(o instanceof MyTime12){
            MyTime12 tmp = (MyTime12) o;
            return this.hour==tmp.getHour() && this.minute==tmp.getMinute() && this.second==tmp.getSecond();
        }
        
        return false;
    }

    public String getPeriod() {
        return this.period;
    }
    public void setPeriod(String period){
        this.period = period;
    }

}
