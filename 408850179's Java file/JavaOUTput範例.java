import java.text.DecimalFormat;

public class test{
    public static void main(String args[]){
         
        //建構時決定資料輸出格式
        //#字號當為小數後面為0時會自動去除
        DecimalFormat formatter = new DecimalFormat("#.###");
		
        //輸出0.35
        System.out.println(formatter.format(0.350));
 
        //透過applyPattern改變格式
        //Pattern 裡0的用處為，當需要自動補0時可以遞補
        formatter.applyPattern("0.00000");
		
        //輸出1.30000
        System.out.println(formatter.format(1.3));
		
        //金錢格式，輸出1,300與200,000
        formatter.applyPattern("#,###,###");
        System.out.println(formatter.format(1300));
        System.out.println(formatter.format(200000));
		
        //與字串一起輸出
        formatter.applyPattern("'abcdefg'#,###,###");
        System.out.println(formatter.format(1300));
        System.out.println(formatter.format(200000));
    }
}
