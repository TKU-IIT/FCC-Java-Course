package HWK1;
import static java.lang.System.out;
import java.util.*;

public class MI2B_HWK1_408850179_3 {
    public static void main(String[] args) {        
        System.out.println("---------- diff(a1,b2) ------------ 6%") ;                
        int[] a1 = {7, -1, 8, 23, -1, 9, 18, 44, 85, 33, 5, 23, 88} ;
        int[] b1 = {7, -1, 18, 23, 44, 9, 28, -1, 85, 33, 15} ;
        out.println("a1[]="+Arrays.toString(a1)) ;
        out.println("b1[]="+Arrays.toString(b1)) ;
        int diff = diff(a1,b1) ;
        System.out.println("#no of diff in a1[] and b1[] is "+diff);
        
        int[] a2 = {23, 45, 66, 23, 49, 87, 33, 17} ;
        int[] b2 = {3, 9, 8, 4, 1, 7, 2, 5} ;
        out.println("a2[]=\t"+Arrays.toString(a2)) ;
        out.println("b2[]=\t"+Arrays.toString(b2)) ;

        System.out.println("----- after swapArray(a2,b2) ------ 5%") ;
        swapArray(a2,b2) ;
        out.println("a2[]=\t"+Arrays.toString(a2)) ;
        out.println("b2[]=\t"+Arrays.toString(b2)) ;     
               
        System.out.println("-------- rotateRight(a[],times) ------ 8%") ;                        
        rotateRight(a1,1); 
        out.println("Rotate-right a1[] 1 times:\na1[]="+Arrays.toString(a1)) ;
        rotateRight(b1,3); 
        out.println("Rotate-right b1[] 3 times:\nb1[]="+Arrays.toString(b1)) ;            
    }
    
    public static int diff(int[] a, int[] b){ // 6%
        // [功能]: 逐元素比較二個陣列的內容, 計算並傳回有差異的元素個數
        // [注意]: (a)若a[i],b[i]中有任一為-1, 略過該元素, 不進行比較
        //        (b) 若a[],b[]長度不相等，以較短的為準。
		// DIY here
    	int longOne, shortOne;
    	int output = 0;
    	boolean found = false;
    	if(a.length>b.length) {
    		longOne = a.length;shortOne = b.length;
    	}else {
    		longOne = b.length;shortOne = a.length;
    	}
    	for(int i = 0 ; i < longOne; i++) {
    		for(int j = 0; j < shortOne; j++) {
    			if(b[j]==a[i]) {
    				found = true;
    				break;
    			}
    		}
    		if(!found) {
    			output++;
    		}
    		found = false;
    	}
    	return output;
    }
    
    public static void swapArray(int[] a, int[] b) { // 5%
        // [功能]: 將a[]的前半部與b[]的後半部互調, 參考[程式輸出]
        // [注意]: 假設a[],b[]的長度相同，並為偶數
		// DIY here
    	int parts = a.length/2;
    	int[] replace = new int[a.length];
    	for(int i = 0; i < parts; i++) {
    		replace[i] = b[parts+i];
    		b[parts+i] = a[i];
    		a[i] = replace[i];
    	}
    }
    public static void rotateRight(int[] a, int times) { // 7%
        // [功能]: 將a[]的內容向右循環位移times
        //        若a[]原為{1,2,3,4,5}, 向右循環位移2次,則a[]={4,5,1,2,3} 
		// DIY here
    	for(int k = 0; k < times;k++) {
    		int i, temp;
    		temp = a[a.length-1]; 
    		for (i = a.length-1; i > 0; i--) {
    			a[i] = a[i-1]; 
    		}
    		a[i] = temp;
    	}
    }
}
