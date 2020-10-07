package hwk3 ;
public class HWK_EX3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {15, 28, 99, 44};
        int[] c = concat(a, b);
        Tools.printArr("c=a&b=", c);
        
        int[] d = {44, 33, 66} ;
        int[] e = {88, 99} ; 
        int[] f = concat(a,b,d,e) ;
        Tools.printArr("f=a&b&d&e=", f);
    }

    public static int[] concat(int[] a, int[] b) {
        int[] x = new int[a.length + b.length];
        // DIY here
        for(int i=0;i<a.length+b.length;i++) {
        	if(i>=a.length)
        		x[i] = b[i-a.length];
        	else
        		x[i] = a[i];
        }
        return x;
    }
    public static int[] concat(int[]... arrs) {
        // DIY here
    	int[] output = {};
    	for(int[]a:arrs) {
    		output=concat(output,a);
    	}
        return  output; // 自行修改
    }
}
