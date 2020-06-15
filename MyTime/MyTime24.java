package javapractice;

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
    public String toString() {
        // implement
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    @Override
    public boolean equals(Object o) {
        // implement
        if(this==o)
            return true;
        
        if(o instanceof MyTime24){
            MyTime24 tmp = (MyTime24) o;
            return this.hour==tmp.getHour() && this.minute==tmp.getMinute() && this.second==tmp.getSecond();
        }
        
        return false;
    }

    @Override
    public int getSecondOfDay() {
        return hour*3600+minute*60+second;
    }
    @Override
	public void addSeconds(int seconds) {
        //get the seconds of day, and add it by the value of "seconds"
        int sod = getSecondOfDay();
        sod += seconds;
        //if the rsult of sod is negative, then make it filled by 24:00:00 (aka 86400sec)
        if(sod < 0)
            sod = 86400 + sod;
        //if the result of sod is greater than one day, then minus n * 24:00:00
        if(sod>=86400)
            sod %= 86400;
        
        hour = sod / 3600;
        minute = (sod - hour*3600) / 60;
        second = (sod - hour*3600 - minute*60);
    }
    //Main Function
    public static void main(String args[]) {
    	MyTime a = new MyTime24();
    	a.addSeconds(1231313);
    	System.out.println(a);
    }
}
