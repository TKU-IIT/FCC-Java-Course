package hwk2;

public class HWK2_408850179_02 { // XX: 你的學號
    // public static int[] monthDays={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
    public static int[] accMonthDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    public static void main(String[] args) {
        System.out.println("===== diffInDays() ===== 10%") ;
        // 計算 1999/3/7與2018/9/30差幾天
        int diff = diffInDays(19990307, 20180930); 
        System.out.println("diff days ="+diff);
    }
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static int iThDaysOfYear(int y, int m, int d) { 
        // [功能]: 計算此日期是當年的第幾天 (第1天是1/1)
        int days = ((m > 1) ? accMonthDays[m - 1] : 0) + d;
        // for (int i=1; i<=m-1; i++) { days+=monthDays[i] ; }
        if (isLeapYear(y) && m > 2) {
            days++;
        }
        return days;
    }
    public static int diffInDays(int date1, int date2) {
        // DIY here
    	int daysDiff1, daysDiff2, output;
    	daysDiff1 = iThDaysOfYear((date1/10000),((date1/100)%10),((date1%100)*10)+(date1%10));
    	daysDiff2 = iThDaysOfYear((date2/10000),((date2/100)%10),((date2%100)*10)+(date2%10));
    	if(daysDiff1>daysDiff2)
    		output = daysDiff1 - daysDiff2;
    	else if(daysDiff2>daysDiff1)
    		output = daysDiff2 - daysDiff1;
    	else
    		return 0;
        return output;
    }
}