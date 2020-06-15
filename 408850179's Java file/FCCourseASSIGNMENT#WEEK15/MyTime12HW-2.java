package java;

public class MyTime12 implements MyTime{
    public static final String AM = "AM";
    public static final String PM = "PM";
    private int hour = 12;
    private int minute = 0;
    private int second = 0;
    private String period = MyTime12.AM;

    public MyTime12(){
    }
    public MyTime12(int hour, int minute, int second, String period) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
        setPeriod(period);
    }
    public int getHour(){
        return this.hour;
    }
    public void setHour(int hour){
        if (hour<=0 || hour>12){
            throw new IllegalArgumentException("Invalid hour "+hour);
        }
        this.hour = hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int minute){
        if (minute<0 || minute>=60){
            throw new IllegalArgumentException("Invalid minute "+minute);
        }
        this.minute = minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setSecond(int second){
        if (second<0 || second>=60){
            throw new IllegalArgumentException("Invalid second "+second);
        }
        this.second = second;
    }
    public String getPeriod(){
        return this.period;
    }
    public void setPeriod(String period){
        if(period != AM){
            this.period = PM;
        }else if(period != PM){
            this.period = AM;
        }else{
            throw new IllegalArgumentException("Invalid period "+period);
        }
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d %s", hour, minute, second, period);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof MyTime12){
            MyTime12 t1 = (MyTime12) o;
            return (this.toString().equals(t1.toString()));
        }else{
            return false;
        }
    }
    @Override
    public int getSecondOfDay(){
        if(period == PM){
            return (hour*3600)*2+minute*60+second;
        }else{
            return hour*3600+minute*60+second;
        }
    }
    @Override
    public void addSeconds(int seconds){
        int total = this.getSecondOfDay()+seconds;
        int loop = 0;
        int changes = 0;
        int cal = 0;
        loop = Math.abs(total/86400);
        changes = Math.abs(seconds/43200);
        if(seconds > 0){
            cal = seconds - (86400*loop);
        }else if(seconds < 0){
            cal = seconds + (86400*(loop+1));
        }
        if((cal/3600) + hour > 12){
            hour = hour - 12;
        }
        if(((cal%3600)/60) + minute > 60){
            minute = minute - 60;
        }
        if(((cal%3600)%60) + second > 60){
            second = second - 60;
        }
        hour = hour + (cal/3600);
        minute = minute + ((cal%3600)/60);
        second = second + ((cal%3600)%60);
        if(changes %2 != 0){
            period = PM;
        }else if(changes % 2 == 0){
            period = AM;
        }
    }
}