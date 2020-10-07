package HWK1;
import java.util.*;

public class MI2B_HWK1_408850179_2 {
	static double avg = 0; // 全域變數，用以儲存某個陣列的平均值
    static double std = 0; // 全域變數，用以儲存某個陣列的標準差
	public static void main(String[] args) {           
		int[] a = new int[28] ;
		int[] b = new int[30] ;
		Random r = new Random(222) ; 
		
		System.out.println("-------- randomFill()----- 4%") ;
		randomFill(a, r, 800, 500) ;
		randomFill(b, r, 227, 39) ;
		
		System.out.println("-------- printArray()----- 5%") ;        
		printArray("a[]=\n", a, ',') ;
		printArray("b[]=\n", b, '\t') ; 
        
		System.out.println("-------- minIndex(a)----- 4%") ;    
        // 印出陣列中的最大值與與最小值，及其在陣列中的註標      
        int minIndex = minIndex(a) ; 
        System.out.println("min of a[] is a["+minIndex+"]:"+a[minIndex]) ;
        
        System.out.println("-------- calAvgStd(a)----- 5%") ;
        calAvgStd(a) ; 
        System.out.printf("avg of a[] is %.3f\n",avg) ;            
        System.out.printf("std of a[] is %.3f\n",std) ;
        
        System.out.println("-------- inStd(a,n) ----- 7%") ;           
        System.out.println("a[] in avg +- 1*std =") ;
        int[] set = inStd(a,1) ; //計算a[]介於平均值正負1個標準差中的元素
        for(int x:set) System.out.print(x+" ") ;
        System.out.println() ;
        
        System.out.println("a[] in avg +- 2*std =") ;        
        set = inStd(a,2) ; //計算a[]介於平均值正負2個標準差中的元素
        for(int x:set) System.out.print(x+" ") ;
        System.out.println() ;   
	}
    public static void randomFill(int[] a, Random r, int ub, int lb) { // 4%
        // [功能]: 利用seed, 將介於[lb,ub]中的整數亂數填入a[]中
    	for (int i = 0 ; i < a.length; i++) {
    		a[i] = r.nextInt((ub-lb)+1)+lb;
    	}
    }
    public static void printArray(String header, int[] a, char sep) { // 5%
         // [功能]: 依照輸出格式印出陣列內容, 每列10個元素，並以字元sep做為元素的分隔符號
        System.out.print(header);
        for(int i = 0; i <a.length ;i++) {
        	if(i%10==0) {//當[i]到第十位數時換行
        		System.out.print("\n");
        	}
        	System.out.print(a[i]);//print(a[i])
        	System.out.print(sep);//以字元sep做為元素的分隔符號
        }
        System.out.print("\n");
    }
    public static int minIndex(int[] a) { // 4%
        // [功能]: 傳回a[]中最小值所在位置的"註標"
    	int temp = a[0], min =0;
    	for(int i = 0; i < a.length; i++) {
    		if(temp>a[i]) {
    			temp = a[i];min = i;
    		}
    	}
        return min ; // 自行修改
    }
    public static void calAvgStd(int[] a) { // 5%
        // [功能]: 計算陣列a[]的平均值、標準差，並將結果存於全域變數avg與std中
    	double sum = 0, vari = 0;
    	for(int i = 0; i < a.length;i++) {
    		sum += a[i];
    	}
    	avg = (sum/a.length);
    	for(int i = 0; i < a.length;i++) {
    		vari += Math.pow((a[i]-avg),2);
    	}
    	std = Math.sqrt((vari/a.length));
    } 
    public static int[] inStd(int[] a, int n) { // 7%
        // [功能]: 找出a[]中介於正負n個標準差的元素，並將其存於一陣列存回
    	calAvgStd(a);
    	
    	ArrayList<Integer> outcome = new ArrayList<Integer>();
    	for(int i = 0; i < a.length; i++) {
    		if(avg-(std*n)<=a[i]&&avg+(std*n)>=a[i]) {
    			outcome.add(a[i]);
    		}
    	}
    	int[] output = new int[outcome.size()];
    	for(int i = 0; i < outcome.size(); i++) {
    		output[i] = outcome.get(i);
    	}
    	return output;   //自行修改
    }    
}
