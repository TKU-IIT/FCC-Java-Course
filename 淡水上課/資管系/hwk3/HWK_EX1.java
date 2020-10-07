package hwk3 ;
public class HWK_EX1 {
    public static void main(String[] args) {
        double[] temperatrure = {-10, 5, 18, -2, 33, -9, -14, 9}; // -14: 0, 33:1
        Tools.printArr("a[]=", temperatrure);
        normalize(temperatrure); // 將a[]中的元素線性正規化至[0,1]
        Tools.printArr("after normalization, a[]=", temperatrure);
    }
    public static void normalize(double[] a) {
        // DIY here
    	double t1 = 0.0, t2 = 1.0;
    	for(int i = 0; i <a.length; i++) {
    		if(a[i]<0)
    			a[i] = t1;
    		else
    			a[i] = t2;
    	}
    }
}
