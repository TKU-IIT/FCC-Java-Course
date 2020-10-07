package hwk2;

public class HWK2_408850179_03 { // XX: 你的學號
    public static void main(String[] args) {
        System.out.println("======= MIN_MAX_SWAP ==== 7%");
        int[] a = {18, 25, 37, 2, 53, 43, 72, 32, 17} ;
        printArray("a[]=",a) ; 
        // DIY here，
        // 找出a[]中的最小值與最大值，並與別與原陣列中的第一個與最後一個元素互換
        MIN_MAX_SWAP(a);
        printArray("After MIN_MAX_SWAP, a[]=",a) ; 

        System.out.println("======= Range remove ==== 5%");
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9} ;
        printArray("b[]=",b) ; 
        int start=2, end=5; 
        // DIY here, 刪除b[2], b[3], b[4], b[5]
        b = arrayRemove(b,start,end);
        printArray("After removing b[2~5], b[]=",b) ;         
    }
    public static void printArray(String header, int[] a) {
        System.out.print(header);
        for (int x:a) System.out.print(x+" ");
        System.out.println();
    }
    public static void MIN_MAX_SWAP(int[] a) {
    	int Max = 10, Min = 10,saveMi = 0, saveMa = 0, e = a.length-1;
    	int tempS, tempE;
    	for(int i = 0; i < a.length; i++) {
    		if(Min>=a[i]) {
    			Min = a[i];
    			saveMi = i;
    		}else if(Max<=a[i]) {
    			Max = a[i];
    			saveMa = i;
    		}
    	}
    	tempS = a[0];
    	tempE = a[e];
    	a[0] = Min;
    	a[e] = Max;
    	a[saveMi] = tempS;
    	a[saveMa] = tempE;
    }
    public static int[] arrayRemove(int[] b,int s,int e) {
    	int[] copy = b.clone();
    	int[] output = new int[b.length-(b.length-e-1)];
    	for(int i = 0; i < b.length;i++) {
    		if(e+i==b.length) break;
    		b[s+i] = copy[e+i];
    		b[e+i] = 0;
    	}
    	System.arraycopy(b, 0, output, 0, output.length);
    	return output;
    }
}
/* [程式輸出]
======= MIN_MAX_SWAP ==== 7%
a[]=18 25 37 2 53 43 72 32 17 
After MIN_MAX_SWAP, a[]=2 25 37 18 53 43 17 32 72 
======= Range remove ==== 5%
b[]=1 2 3 4 5 6 7 8 9 
After removal b[2~5], b[]=1 2 7 8 9 
*/